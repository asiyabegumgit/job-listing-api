package com.perscholas.joblisting.repository;

import com.perscholas.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
