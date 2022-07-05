package com.codebooth.springusercommentstaff.userCommentPackage.usercomment;

import com.codebooth.springusercommentstaff.userPackage.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USER_COMMENT")
@Getter
@Setter
public class UserComment {

    @Id
    @GeneratedValue(generator = "UserComment")
    @SequenceGenerator(name = "UserComment", sequenceName = "USER_COMMENT_ID_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "COMMENT", length = 500)
    private String comment;

    @Column(name = "COMMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date commentDate;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            optional = false
    )

    private User user;
}
