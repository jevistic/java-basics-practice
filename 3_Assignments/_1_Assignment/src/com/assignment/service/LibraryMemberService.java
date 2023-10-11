package com.assignment.service;

import com.assignment.model.LibraryMember;
import com.assignment.repository.LibraryMemberRepository;

import java.util.List;

public class LibraryMemberService implements CrudService<LibraryMember>, SearchService<LibraryMember> {
    private LibraryMemberRepository memberRepository;

    public LibraryMemberService(LibraryMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public LibraryMember create(LibraryMember member) {
        return memberRepository.create(member);
    }

    @Override
    public LibraryMember read(long id) {
        return memberRepository.read(id);
    }

    @Override
    public LibraryMember update(LibraryMember member) {
        return memberRepository.update(member);
    }

    @Override
    public void delete(long id) {
        memberRepository.delete(id);
    }

    @Override
    public List<LibraryMember> search(String keyword) {
        return memberRepository.search(keyword);
    }
}
