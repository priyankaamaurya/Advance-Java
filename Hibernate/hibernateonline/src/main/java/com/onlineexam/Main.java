package com.onlineexam;

public class Main {

    public static void main(String[] args) {

        OnlineDao dao = new OnlineDao();

        // 🔹 CREATE EXAM
        Exam exam = new Exam();
        exam.setExamId(901);
        exam.setSubjectName("Hibernate");
        exam.setTotalMarks(100);
        exam.setExamDate("15-02-2026");

        // 🔹 SAVE
        dao.save(exam);
        System.out.println("Exam Saved");

        // 🔹 FIND
        Exam e = dao.find(901);
        System.out.println("Subject: " + e.getSubjectName());
        System.out.println("Marks: " + e.getTotalMarks());
        System.out.println("Date: " + e.getExamDate());

        // 🔹 UPDATE
        e.setTotalMarks(120);
        dao.update(e);
        System.out.println("Exam Updated");

        // 🔹 DELETE
//        dao.delete(901);
//        System.out.println("Exam Deleted");
    }
}
