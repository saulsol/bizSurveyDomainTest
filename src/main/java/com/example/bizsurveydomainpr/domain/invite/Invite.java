package com.example.bizsurveydomainpr.domain.invite;


import com.example.bizsurveydomainpr.domain.BaseEntity;
import com.example.bizsurveydomainpr.domain.workspace.Workspace;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "invite")
public class Invite extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invite_id")
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String token;

    private String deadline;

    @Column(nullable = false)
    private Boolean inviteFlag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workspace_id")
    private Workspace workspace;




}
