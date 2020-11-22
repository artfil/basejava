package com.core.webapp.storage;

import com.core.webapp.model.Resume;

import java.util.*;

public class MapStorage extends AbstractStorage {

    private final Map<String, Resume> storage = new HashMap<>();

    @Override
    protected Object getSearchKey(String uuid) {
        return null;
    }

    @Override
    protected void doSave(Resume resume, Object searchKey) {
        storage.put(resume.getUuid(), resume);
    }

    @Override
    protected void doUpdate(Resume resume, Object searchKey) {
    }

    @Override
    protected void doDelete(Object searchKey) {
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return null;
    }

    @Override
    protected boolean isExist(Object searchKey) {
        return false;
    }

    public void clear() {
        storage.clear();
    }

    public List<Resume> getAllSorted() {
        return new ArrayList<>(storage.values());
    }

    public int size() {
        return storage.size();
    }
}