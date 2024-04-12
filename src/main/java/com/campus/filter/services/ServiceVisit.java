package com.campus.filter.services;

import java.util.List;

import com.campus.filter.dto.VisitDTO;
import com.campus.filter.exception.BussinesRuleException;

public interface ServiceVisit {
    
    List<VisitDTO> findAll();

    VisitDTO findById(Long id) throws BussinesRuleException;

    List<VisitDTO> findByPropertyId(Long id) throws BussinesRuleException;

    List<VisitDTO> findByVisitorId(Long id) throws BussinesRuleException;

    VisitDTO save(VisitDTO property);

    VisitDTO update(Long id, VisitDTO property);

    void delete(Long id);

}