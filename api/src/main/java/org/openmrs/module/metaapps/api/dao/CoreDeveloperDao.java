package org.openmrs.module.metaapps.api.dao;

import org.openmrs.api.APIException;
import org.openmrs.module.metaapps.entity.CoreDeveloper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CoreDeveloperDao {
	
	@Transactional
	public void saveDev(CoreDeveloper coreDeveloper) throws APIException;
	
	@Transactional
	public List<CoreDeveloper> getAllCoreDeveloper() throws APIException;
	
	@Transactional
	public CoreDeveloper getCoreDeveloper(Integer coreDeveloperId) throws APIException;
	
	@Transactional
	public void updateCoreDeveloper(CoreDeveloper coreDeveloper) throws APIException;
}
