package com.example.demo.businesslevel.servicelayer;

import com.example.demo.businesslevel.domainlayer.PDFFile;

import java.util.List;

public interface PDFFileService {

	List<PDFFile> getAll();

	PDFFile save(PDFFile pdfFile);

	PDFFile getById(Long id);

}
