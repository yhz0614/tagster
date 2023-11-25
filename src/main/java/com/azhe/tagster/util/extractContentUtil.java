package com.azhe.tagster.util;

import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLTextExtractor;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.*;
import java.nio.file.Files;

/**
 * @author: azhe
 * @description: 提取文件中的文字信息
 * @date: 2023/11/25 14:18
 */


public class extractContentUtil {

    public static String readDoc(String path) throws IOException {
        String content = "";
        File file  = new File(path);
        //首先判断文件中的是doc/docx
        try {
            if (path.endsWith(".doc")) {
                FileInputStream fis = null;
                HWPFDocument document = null;
                WordExtractor extractor = null;
                fis =  new FileInputStream(file);
                document = new HWPFDocument(fis);
                extractor = new WordExtractor(document);
                content = extractor.getText();
            } else if (path.endsWith(".docx")) {
                FileInputStream fis = null;
                XWPFDocument document = null;
                XWPFWordExtractor extractor = null;
                fis = new FileInputStream(file);
                document = new XWPFDocument(fis);
                extractor = new XWPFWordExtractor(document);
                content = extractor.getText();
            } else {
                System.out.println("此文件不是word文件");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return content;
    }

    /**
     * 一次获取整个pdf文件的内容
     *
     * @throws Exception
     */
//    public static String readPDF(String path) throws Exception {
//        File file = new File(path);
//        RandomAccessFile is_pdf = new RandomAccessFile(file, "r");
//        PDFParser parser = new PDFParser(is_pdf);
//        parser.parse();
//        PDDocument doc = parser.getPDDocument();
//        PDFTextStripper textStripper = new PDFTextStripper();
//        String s = textStripper.getText(doc);
//        System.out.println("总页数：" + doc.getNumberOfPages());
//        System.out.println("输出内容：");
//        System.out.println(s);
//        doc.close();
//        return s;
//    }
//
//    /**
//     * 分页获取文字的内容
//     *
//     * @throws Exception
//     */
//    public static void readPDFbyPage(String path) throws Exception {
//        File file = new File(path);
//        RandomAccessFile is = new RandomAccessFile(file, "r");
//        PDFParser parser = new PDFParser(is);
//        parser.parse();
//        PDDocument doc = parser.getPDDocument();
//        PDFTextStripper textStripper = new PDFTextStripper();
//        for (int i = 1; i <= doc.getNumberOfPages(); i++) {
//            textStripper.setStartPage(i);
//            textStripper.setEndPage(i);
//            // 一次输出多个页时，按顺序输出
//            textStripper.setSortByPosition(true);
//            String s = textStripper.getText(doc);
//            System.out.println("当前页：" + i);
//            System.out.println("输出内容：");
//            System.out.println(s);
//        }
//        doc.close();
//    }


//    main方法测试
//    public static void main(String[] args) {
//        //测试文件
//        String filename="/Applications/code/java/tagster/files/uploadFiles/2023年”中控信息杯”第十届浙江省大学生服务外包创新应用大赛_统一命题.pdf";
//        String textContent = null;
//        try {
//            textContent = readPDF(filename);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(textContent);
//
//    }
}



