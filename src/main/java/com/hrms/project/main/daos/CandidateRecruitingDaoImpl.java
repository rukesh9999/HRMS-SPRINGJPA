package com.hrms.project.main.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrms.project.main.model.RecruitedCandidate;

@Repository
public class CandidateRecruitingDaoImpl implements CandidateRecruitingDao{

	private EntityManager entityManager;

	@Autowired
	public CandidateRecruitingDaoImpl(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	@Override
	public void AddRecruitedCandidate(RecruitedCandidate recruitedCandidate) {
	
		RecruitedCandidate dbrecruitedCandidate =  entityManager.merge(recruitedCandidate);
		System.out.println(recruitedCandidate.getId()+"......."+dbrecruitedCandidate.getId());
		recruitedCandidate.setId(dbrecruitedCandidate.getId());
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RecruitedCandidate> getAllRecruitedCandidatesDeatils() {
		
		Query query = entityManager.createQuery("from RecruitedCandidate", RecruitedCandidate.class);
		List<RecruitedCandidate> listofRecruitedCandidate =  query.getResultList();
		return listofRecruitedCandidate;
	}

	@Override
	public RecruitedCandidate getRecruitedCandidateById(int id) {
		RecruitedCandidate recruitedCandidate = entityManager.find(RecruitedCandidate.class, id);
		return recruitedCandidate;
	}

	@Override
	public void deleteRecruitedCandidate(int id) {
       Query query = entityManager.createQuery("delete from RecruitedCandidate where id=:RecruitedCandidateId");	
       query.setParameter("RecruitedCandidateId", id);
       query.executeUpdate();
	}

	
}
