package com.project.mything.friend.repository.applyQueryDsl;

import com.project.mything.friend.dto.ApplyDto;

import java.util.List;

public interface ApplyQueryRepository {
    public abstract List<ApplyDto.ResponseSimpleApply> getApply(Long userId, Boolean isReceiveApply);
}
