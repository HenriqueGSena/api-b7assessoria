package com.crud.b7assessoria.entities;

import java.util.List;

public class PageResponse<T> {

    private List<T> data;
    private int currentPage;
    private int totalPages;
    private String prevPage;
    private String nextPage;

    public PageResponse(List<T> data, int currentPage, int totalPages, String prevPage, String nextPage) {
        this.data = data;
        this.currentPage = currentPage;
        this.totalPages = totalPages;
        this.prevPage = prevPage;
        this.nextPage = nextPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getPrevPage() {
        return prevPage;
    }

    public void setPrevPage(String prevPage) {
        this.prevPage = prevPage;
    }

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }
}
