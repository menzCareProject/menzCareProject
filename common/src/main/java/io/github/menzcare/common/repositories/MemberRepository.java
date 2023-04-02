package io.github.menzcare.common.repositories;

import io.github.menzcare.common.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
