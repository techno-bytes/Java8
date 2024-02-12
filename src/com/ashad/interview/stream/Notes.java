package com.ashad.interview.stream;

public class Notes {

    private int noteId;
    private int tagId;
    private String tagName;


    public Notes(int noteId, String tagNa,int tagId) {
        this.noteId = noteId;
        this.tagId = tagId;
        this.tagName = tagName;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
