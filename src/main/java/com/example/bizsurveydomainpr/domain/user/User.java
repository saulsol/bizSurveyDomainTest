package com.example.bizsurveydomainpr.domain.user;

import com.example.bizsurveydomainpr.constant.Gender;
import com.example.bizsurveydomainpr.constant.Plan;
import com.example.bizsurveydomainpr.domain.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String nickname;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false)
    private String birthdate;

    private String password;

    private String company;

    @Enumerated(EnumType.STRING)
    private Plan planSubscribe;


}
