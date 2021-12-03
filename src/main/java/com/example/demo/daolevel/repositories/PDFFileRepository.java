package com.example.demo.daolevel.repositories;

import com.example.demo.businesslevel.domainlayer.PDFFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PDFFileRepository extends JpaRepository<PDFFile, Long> {
    PDFFile findPDFFileById(Long id);
}
