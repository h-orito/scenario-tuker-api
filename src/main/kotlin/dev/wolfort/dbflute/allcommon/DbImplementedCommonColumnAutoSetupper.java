package dev.wolfort.dbflute.allcommon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.dbflute.Entity;
import org.dbflute.hook.CommonColumnAutoSetupper;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public class DbImplementedCommonColumnAutoSetupper implements CommonColumnAutoSetupper {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** The logger instance for this class. (NotNull) */
    private static final Logger _log = LoggerFactory.getLogger(DbImplementedCommonColumnAutoSetupper.class);

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    // =====================================================================================
    //                                                                                Set up
    //                                                                                ======
    /** {@inheritDoc} */
    public void handleCommonColumnOfInsertIfNeeds(Entity targetEntity) {
        final DbEntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "INSERT");
        }
        doHandleCommonColumnOfInsertIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfInsertIfNeeds(DbEntityDefinedCommonColumn entity) {
        final java.time.LocalDateTime registerDatetime = org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread();
        entity.setRegisterDatetime(registerDatetime);
        final String registerTrace = org.dbflute.hook.AccessContext.getAccessUserOnThread();
        entity.setRegisterTrace(registerTrace);
        final java.time.LocalDateTime updateDatetime = entity.getRegisterDatetime();
        entity.setUpdateDatetime(updateDatetime);
        final String updateTrace = entity.getRegisterTrace();
        entity.setUpdateTrace(updateTrace);
    }

    /** {@inheritDoc} */
    public void handleCommonColumnOfUpdateIfNeeds(Entity targetEntity) {
        final DbEntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "UPDATE");
        }
        doHandleCommonColumnOfUpdateIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfUpdateIfNeeds(DbEntityDefinedCommonColumn entity) {
        final java.time.LocalDateTime updateDatetime = org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread();
        entity.setUpdateDatetime(updateDatetime);
        final String updateTrace = org.dbflute.hook.AccessContext.getAccessUserOnThread();
        entity.setUpdateTrace(updateTrace);
    }

    // =====================================================================================
    //                                                                         Assist Helper
    //                                                                         =============
    protected DbEntityDefinedCommonColumn askIfEntitySetup(Entity targetEntity) {
        if (!hasCommonColumn(targetEntity)) {
            return null;
        }
        return downcastEntity(targetEntity);
    }

    protected boolean hasCommonColumn(Entity targetEntity) {
        return targetEntity instanceof DbEntityDefinedCommonColumn;
    }

    protected DbEntityDefinedCommonColumn downcastEntity(Entity targetEntity) {
        return (DbEntityDefinedCommonColumn)targetEntity;
    }

    // =====================================================================================
    //                                                                               Logging
    //                                                                               =======
    protected boolean isInternalDebugEnabled() {
        return DbDBFluteConfig.getInstance().isInternalDebug() && _log.isDebugEnabled();
    }

    protected void logSettingUp(DbEntityDefinedCommonColumn entity, String keyword) {
        _log.debug("...Setting up column columns of " + entity.asTableDbName() + " before " + keyword);
    }
}
