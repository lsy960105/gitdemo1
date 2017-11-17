package com.company.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.company.dao.idao.ReportDao;
import com.company.service.dto.result.ReportByClientType;
import com.company.service.dto.result.ReportByGender;

@Repository("reportDao")
public class ReportDaoImpl implements ReportDao {

	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public List<ReportByGender> reportByGender() throws Exception {
		String sql = "SELECT gender,COUNT(gender) count,"
				+ "(CASE WHEN FLOOR(DATEDIFF('2017-11-01',birthday)/3650)=1 THEN '10~19' "
				+ " WHEN FLOOR(DATEDIFF('2017-11-01',birthday)/3650)=3 THEN '30~39' "
				+ "WHEN FLOOR(DATEDIFF('2017-11-01',birthday)/3650)=2 THEN '20~29'  "
				+ "WHEN FLOOR(DATEDIFF('2017-11-01',birthday)/3650)=4 THEN '40~49'  "
				+ "WHEN FLOOR(DATEDIFF('2017-11-01',birthday)/3650)=5 THEN '50~59'  "
				+ "WHEN FLOOR(DATEDIFF('2017-11-01',birthday)/3650)=6 THEN '60~69'  END)AS 'ageGroup' " + "FROM t_client "
				+ "WHERE clientid IN(SELECT clientid " + " FROM t_order " + " WHERE orderid IN(SELECT " + "   orderid "
				+ "FROM t_orderitems" + " WHERE intime LIKE '2016%' )) "
				+ "GROUP BY FLOOR(DATEDIFF('2017-11-01',birthday)/3650),gender";

		SQLQuery query = sessionFactory.openSession().createSQLQuery(sql);
		query.addScalar("gender");
		query.addScalar("count");
		query.addScalar("ageGroup");
		query.setResultTransformer(Transformers.aliasToBean(ReportByGender.class));
		List<ReportByGender> reportList = query.list();
		return reportList;
	}

	@Override
	public List<ReportByClientType> reportClientType() throws Exception {
		String sql = "SELECT too.s quarter,trt.rt_name roomTypeName,too.innum inNum,too.sumprice income "
				+ "FROM t_room_type trt,t_order tor,t_orderitems toi,"
				+ "(SELECT CONCAT(YEAR(INTIME),'_',QUARTER(INTIME)) s,ROOMTYPEID,"
				+ "SUM(ORDERITEMSCOUNT*DATEDIFF(OUTTIME,INTIME)) innum,"
				+ "SUM(ORDERITEMSPRICE*DATEDIFF(OUTTIME,INTIME)) sumprice "
				+ "FROM t_orderitems WHERE DATE_FORMAT(INTIME,'%Y') = '2016' " + "GROUP BY s,ROOMTYPEID ) too "
				+ "WHERE too.ROOMTYPEID = trt.rt_id AND " + "toi.ORDERID = tor.ORDERID AND "
				+ "toi.ROOMTYPEID = too.ROOMTYPEID AND " + "tor.ORDERSTATE = 'finish' GROUP BY "
				+ "too.s,too.ROOMTYPEID ORDER BY too.s,too.ROOMTYPEID";

		SQLQuery query = sessionFactory.openSession().createSQLQuery(sql);
		query.addScalar("quarter");
		query.addScalar("roomTypeName");
		query.addScalar("inNum");
		// System.out.println(query.addScalar("inNum").getReturnTypes());
		query.addScalar("income");
		query.setResultTransformer(Transformers.aliasToBean(ReportByClientType.class));
		List<ReportByClientType> reportList = query.list();
		return reportList;
	}

}
