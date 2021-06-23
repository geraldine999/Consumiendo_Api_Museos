package com.example.consumiendo_api_museos;

import java.util.List;

public class ListaMuseos {

    private Integer count;
    private String next;
    private String previous;
    private List <Museo> results;

    public ListaMuseos() {
    }

    public ListaMuseos(Integer count, String next, String previous, List<Museo> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Museo> getResults() {
        return results;
    }

    public void setResults(List<Museo> results) {
        this.results = results;
    }
}
