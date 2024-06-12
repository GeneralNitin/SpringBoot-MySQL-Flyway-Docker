package com.generalnitin.springdockercompose.service;

import com.generalnitin.springdockercompose.repository.EntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class HomeService {

    private final EntityRepository entityRepository;

    public List<Object> getAllData() {
        return Collections.singletonList(entityRepository.findAll());
    }
}
