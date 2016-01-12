package com.xxl.job.dao;


import java.util.Date;
import java.util.List;

import com.xxl.job.core.model.XxlJobLog;

/**
 * job log
 * @author xuxueli 2016-1-12 18:03:06
 */
public interface IXxlJobLogDao {
	
	public int save(XxlJobLog xxlJobLog);
	
	public XxlJobLog load(int id);
	
	public int updateTriggerInfo(XxlJobLog xxlJobLog);
	
	public int updateHandleInfo(XxlJobLog xxlJobLog);
	
	public List<XxlJobLog> pageList(int offset, int pagesize,String jobName, Date triggerTimeStart, Date triggerTimeEnd);
	
	public int pageListCount(int offset, int pagesize,String jobName, Date triggerTimeStart, Date triggerTimeEnd);
	
}
