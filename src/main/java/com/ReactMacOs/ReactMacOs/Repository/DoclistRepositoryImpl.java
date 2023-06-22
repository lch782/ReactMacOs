package com.ReactMacOs.ReactMacOs.Repository;

import com.ReactMacOs.ReactMacOs.Entity.DoclistEntity;
import com.ReactMacOs.ReactMacOs.Entity.QDoclistEntity;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class DoclistRepositoryImpl implements DoclistRepositoryCustom {

    private final JPAQueryFactory jpaQueryFactory;

    public DoclistRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    @Override
    public void insertList(DoclistEntity doclistEntity) {
        QDoclistEntity qDoclistEntity = QDoclistEntity.doclistEntity;

        jpaQueryFactory
                .insert(qDoclistEntity)
                .set(qDoclistEntity.icon, doclistEntity.getIcon())
                .set(qDoclistEntity.ord, doclistEntity.getOrd())
                .set(qDoclistEntity.file_name, doclistEntity.getFile_name())
                .execute();
    }

    @Override
    public void deleteList(DoclistEntity doclistEntity) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteList'");
    }

}
