package com.amigoscode.springsecurity.security;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

import static com.amigoscode.springsecurity.security.ApplicationUserPermission.COURSE_READ;
import static com.amigoscode.springsecurity.security.ApplicationUserPermission.COURSE_WRITE;
import static com.amigoscode.springsecurity.security.ApplicationUserPermission.STUDENT_WRITE;

@Getter
@RequiredArgsConstructor
public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ, COURSE_WRITE, STUDENT_WRITE, STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;
}
