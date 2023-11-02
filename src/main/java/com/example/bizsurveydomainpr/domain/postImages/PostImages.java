package com.example.bizsurveydomainpr.domain.postImages;

import com.example.bizsurveydomainpr.domain.BaseEntity;
import com.example.bizsurveydomainpr.domain.post.Post;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "post_images")
public class PostImages extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postimages_id")
    private Long id;

    private String imgName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;
}
