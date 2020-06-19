package com.hrms.project.main.services;

import java.util.List;

import com.hrms.project.main.model.RecruitedCandidate;

public interface CandidateRecruitingService {
	  void AddRecruitedCandidate(RecruitedCandidate recruitedCandidate);
	  List<RecruitedCandidate> getAllRecruitedCandidatesDeatils();
	  RecruitedCandidate  getRecruitedCandidateById(int id);
	  void deleteRecruitedCandidate(int id);

}
