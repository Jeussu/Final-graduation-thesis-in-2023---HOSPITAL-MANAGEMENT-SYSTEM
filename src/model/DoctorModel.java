/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author minhv
 */
public class DoctorModel {
    private int docId;
    private String docName;

    public DoctorModel(int docId, String docName) {
        this.docId = docId;
        this.docName = docName;
    }

    public int getDocId() {
        return docId;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }
    
}
