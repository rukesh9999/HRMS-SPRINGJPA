package com.hrms.project.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hrms.project.main.daos.CandidateRecruitingDao;
import com.hrms.project.main.model.RecruitedCandidate;

@Service
public class CandidateRecruitingServiceImpl  implements CandidateRecruitingService{

	
	private CandidateRecruitingDao candidateRecruitingDao;

	@Autowired
	public CandidateRecruitingServiceImpl(CandidateRecruitingDao candidateRecruitingDao) {
		
		this.candidateRecruitingDao = candidateRecruitingDao;
	}

	@Override
	@Transactional
	public void AddRecruitedCandidate(RecruitedCandidate recruitedCandidate) {
		candidateRecruitingDao.AddRecruitedCandidate(recruitedCandidate);
	}

	
	@Override
	@Transactional
	public List<RecruitedCandidate> getAllRecruitedCandidatesDeatils() {
		
		List<RecruitedCandidate> listOfRecruitedCandidate = candidateRecruitingDao.getAllRecruitedCandidatesDeatils();
		
		return listOfRecruitedCandidate;
	}

	@Override
	@Transactional
	public RecruitedCandidate getRecruitedCandidateById(int id) {
	   RecruitedCandidate recruitedCandidate =	candidateRecruitingDao.getRecruitedCandidateById(id);
		return recruitedCandidate;
	}

	@Override
	@Transactional
	public void deleteRecruitedCandidate(int id) {
        candidateRecruitingDao.deleteRecruitedCandidate(id);		
	}
	
	
	
}
