package com.media.media.Repositories;

import com.media.media.Beans.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<SocialUser,Long> {
}
