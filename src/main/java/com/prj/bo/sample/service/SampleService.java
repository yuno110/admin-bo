package com.prj.bo.sample.service;

import org.springframework.stereotype.Service;
import com.prj.bo.sample.mapper.SampleMapper;

import java.util.List;
import java.util.Map;

@Service
public class SampleService {

    private final SampleMapper sampleMapper;

    public SampleService(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
    }

    public List<Map<String, Object>> getSampleList() {
        return sampleMapper.getSampleList();
    }
}
