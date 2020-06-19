package com.hrms.project.main.daos;

import java.util.List;

import com.hrms.project.main.model.RecruitedCandidate;

public interface CandidateRecruitingDao {
  void AddRecruitedCandidate(RecruitedCandidate recruitedCandidate);
  List<RecruitedCandidate> getAllRecruitedCandidatesDeatils();
  RecruitedCandidate  getRecruitedCandidateById(int id);
  void deleteRecruitedCandidate(int id);
}
