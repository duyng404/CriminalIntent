package com.ryuko.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public UUID getmId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        this.mSolved = solved;
    }

    public void setDate(Date date) {
        this.mDate = date;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public Crime(){
        // Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
