package com.example.bizsurveydomainpr.domain.workspace;

import com.example.bizsurveydomainpr.constant.WorkspaceType;
import com.example.bizsurveydomainpr.domain.user.User;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "workspace")
public class Workspace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workspace_id")
    private Long id;

    private String workspaceName;

    @Enumerated(EnumType.STRING)
    private WorkspaceType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
