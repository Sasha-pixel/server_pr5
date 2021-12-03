package com.example.demo.businesslevel.servicelayer.impl;

import com.example.demo.businesslevel.domainlayer.PDFFile;
import com.example.demo.businesslevel.servicelayer.PDFFileService;
import com.example.demo.daolevel.repositories.PDFFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PDFFileServiceImpl implements PDFFileService {

	@Autowired
	private PDFFileRepository pdfFileRepository;

	@Override
	public List<PDFFile> getAll() {
		return pdfFileRepository.findAll();
	}

	@Override
	public PDFFile save(PDFFile pdfFile) {
		return pdfFileRepository.save(pdfFile);
	}

	@Override
	public PDFFile getById(Long id) {
		return pdfFileRepository.findPDFFileById(id);
	}
}
