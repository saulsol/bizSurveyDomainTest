package com.example.bizsurveydomainpr.domain.sharedList;


import com.example.bizsurveydomainpr.domain.BaseEntity;
import com.example.bizsurveydomainpr.domain.contact.Contact;
import com.example.bizsurveydomainpr.domain.sharedSurvey.SharedSurvey;
import com.example.bizsurveydomainpr.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "shared_list")
public class SharedList extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shared_list_id")
    private Long id;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private Boolean responseFlag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shared_survey_id")
    private SharedSurvey sharedSurvey;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id")
    private Contact contact;


}
