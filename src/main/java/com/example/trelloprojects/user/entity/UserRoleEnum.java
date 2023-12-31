package com.example.trelloprojects.user.entity;

public enum UserRoleEnum {
    USER(Authority.USER),  // 사용자 권한
    MANAGER(Authority.MANAGER), // 운영자 권한
    ADMIN(Authority.ADMIN),  // 관리자 권한
    WITHDRAW(Authority.WITHDRAW); // 휴먼 계정

    private final String authority;

    UserRoleEnum(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return this.authority;
    }

    public static class Authority {

        public static final String USER = "ROLE_USER";
        public static final String MANAGER = "ROLE_MANAGER";
        public static final String ADMIN = "ROLE_ADMIN";
        public static final String WITHDRAW = "ROLE_WITHDRAW";
    }
}
