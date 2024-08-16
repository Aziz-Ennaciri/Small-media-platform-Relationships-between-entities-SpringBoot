package com.media.media.Repositories;

import com.media.media.Beans.SocialGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<SocialGroup,Long> {
}
