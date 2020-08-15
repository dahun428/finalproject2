package com.sample.service;

import java.util.List;

import com.sample.web.view.Mate;
import com.sample.web.view.MateTimeLine;
import com.sample.web.view.User;

public interface MateService {
    void addMate(Mate mate);
    List<Mate> getMatesByPerformanceId(int performanceId);
    Mate getMateById(int mateId);
    MateTimeLine getMateTimeLineByMateId(int mateId);
    void insertMateTimeLine(int mateId, MateTimeLine mateTimeLine);
    void addHashTag(int mateId, List<String> mateTags);
    void addMateMember(int mateId, User newMember);
    void changeCategory(int mateId, String category);
    
}