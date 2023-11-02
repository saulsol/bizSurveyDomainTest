package com.example.bizsurveydomainpr.domain.survey;


import com.example.bizsurveydomainpr.constant.SurveyType;
import com.example.bizsurveydomainpr.domain.user.User;
import com.example.bizsurveydomainpr.domain.workspace.Workspace;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "survey_id")
    private Long id;

    @Column(nullable = false)
    private String title;


    private String content;

    @Enumerated(EnumType.STRING)
    private SurveyType type;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workspace_id")
    private Workspace workspace;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


}
