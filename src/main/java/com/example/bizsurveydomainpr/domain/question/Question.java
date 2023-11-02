package com.example.bizsurveydomainpr.domain.question;


import com.example.bizsurveydomainpr.constant.AnswerType;
import com.example.bizsurveydomainpr.domain.BaseEntity;
import com.example.bizsurveydomainpr.domain.survey.Survey;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "question")
public class Question extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long id;

    @Column(nullable = false)
    private String surveyQuestion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AnswerType answerType;

    private int score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "survey_id")
    private Survey survey;

}
