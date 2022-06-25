package dev.wolfort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import dev.wolfort.dbflute.allcommon.DbEntityDefinedCommonColumn;
import dev.wolfort.dbflute.allcommon.DbDBMetaInstanceHandler;
import dev.wolfort.dbflute.exentity.*;

/**
 * The entity of USER_FOLLOW as TABLE. <br>
 * <pre>
 * [primary-key]
 *     user_follow_id
 *
 * [column]
 *     user_follow_id, from_user_id, to_user_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     user_follow_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     userByFromUserId, userByToUserId
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userFollowId = entity.getUserFollowId();
 * Integer fromUserId = entity.getFromUserId();
 * Integer toUserId = entity.getToUserId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setUserFollowId(userFollowId);
 * entity.setFromUserId(fromUserId);
 * entity.setToUserId(toUserId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsUserFollow extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** user_follow_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _userFollowId;

    /** from_user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user} */
    protected Integer _fromUserId;

    /** to_user_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to user} */
    protected Integer _toUserId;

    /** register_datetime: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** register_trace: {NotNull, VARCHAR(64)} */
    protected String _registerTrace;

    /** update_datetime: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _updateDatetime;

    /** update_trace: {NotNull, VARCHAR(64)} */
    protected String _updateTrace;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DbDBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "user_follow";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userFollowId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param fromUserId : UQ+, NotNull, INT UNSIGNED(10), FK to user. (NotNull)
     * @param toUserId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to user. (NotNull)
     */
    public void uniqueBy(Integer fromUserId, Integer toUserId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("fromUserId");
        __uniqueDrivenProperties.addPropertyName("toUserId");
        setFromUserId(fromUserId);setToUserId(toUserId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** USER by my from_user_id, named 'userByFromUserId'. */
    protected OptionalEntity<DbUser> _userByFromUserId;

    /**
     * [get] USER by my from_user_id, named 'userByFromUserId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userByFromUserId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbUser> getUserByFromUserId() {
        if (_userByFromUserId == null) { _userByFromUserId = OptionalEntity.relationEmpty(this, "userByFromUserId"); }
        return _userByFromUserId;
    }

    /**
     * [set] USER by my from_user_id, named 'userByFromUserId'.
     * @param userByFromUserId The entity of foreign property 'userByFromUserId'. (NullAllowed)
     */
    public void setUserByFromUserId(OptionalEntity<DbUser> userByFromUserId) {
        _userByFromUserId = userByFromUserId;
    }

    /** USER by my to_user_id, named 'userByToUserId'. */
    protected OptionalEntity<DbUser> _userByToUserId;

    /**
     * [get] USER by my to_user_id, named 'userByToUserId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userByToUserId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbUser> getUserByToUserId() {
        if (_userByToUserId == null) { _userByToUserId = OptionalEntity.relationEmpty(this, "userByToUserId"); }
        return _userByToUserId;
    }

    /**
     * [set] USER by my to_user_id, named 'userByToUserId'.
     * @param userByToUserId The entity of foreign property 'userByToUserId'. (NullAllowed)
     */
    public void setUserByToUserId(OptionalEntity<DbUser> userByToUserId) {
        _userByToUserId = userByToUserId;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsUserFollow) {
            DbBsUserFollow other = (DbBsUserFollow)obj;
            if (!xSV(_userFollowId, other._userFollowId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userFollowId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userByFromUserId != null && _userByFromUserId.isPresent())
        { sb.append(li).append(xbRDS(_userByFromUserId, "userByFromUserId")); }
        if (_userByToUserId != null && _userByToUserId.isPresent())
        { sb.append(li).append(xbRDS(_userByToUserId, "userByToUserId")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userFollowId));
        sb.append(dm).append(xfND(_fromUserId));
        sb.append(dm).append(xfND(_toUserId));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_registerTrace));
        sb.append(dm).append(xfND(_updateDatetime));
        sb.append(dm).append(xfND(_updateTrace));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_userByFromUserId != null && _userByFromUserId.isPresent())
        { sb.append(dm).append("userByFromUserId"); }
        if (_userByToUserId != null && _userByToUserId.isPresent())
        { sb.append(dm).append("userByToUserId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbUserFollow clone() {
        return (DbUserFollow)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_follow_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'user_follow_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserFollowId() {
        checkSpecifiedProperty("userFollowId");
        return _userFollowId;
    }

    /**
     * [set] user_follow_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param userFollowId The value of the column 'user_follow_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserFollowId(Integer userFollowId) {
        registerModifiedProperty("userFollowId");
        _userFollowId = userFollowId;
    }

    /**
     * [get] from_user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @return The value of the column 'from_user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getFromUserId() {
        checkSpecifiedProperty("fromUserId");
        return _fromUserId;
    }

    /**
     * [set] from_user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @param fromUserId The value of the column 'from_user_id'. (basically NotNull if update: for the constraint)
     */
    public void setFromUserId(Integer fromUserId) {
        registerModifiedProperty("fromUserId");
        _fromUserId = fromUserId;
    }

    /**
     * [get] to_user_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @return The value of the column 'to_user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getToUserId() {
        checkSpecifiedProperty("toUserId");
        return _toUserId;
    }

    /**
     * [set] to_user_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @param toUserId The value of the column 'to_user_id'. (basically NotNull if update: for the constraint)
     */
    public void setToUserId(Integer toUserId) {
        registerModifiedProperty("toUserId");
        _toUserId = toUserId;
    }

    /**
     * [get] register_datetime: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'register_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] register_datetime: {NotNull, DATETIME(19)} <br>
     * @param registerDatetime The value of the column 'register_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] register_trace: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'register_trace'. (basically NotNull if selected: for the constraint)
     */
    public String getRegisterTrace() {
        checkSpecifiedProperty("registerTrace");
        return convertEmptyToNull(_registerTrace);
    }

    /**
     * [set] register_trace: {NotNull, VARCHAR(64)} <br>
     * @param registerTrace The value of the column 'register_trace'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterTrace(String registerTrace) {
        registerModifiedProperty("registerTrace");
        _registerTrace = registerTrace;
    }

    /**
     * [get] update_datetime: {NotNull, DATETIME(19)} <br>
     * @return The value of the column 'update_datetime'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getUpdateDatetime() {
        checkSpecifiedProperty("updateDatetime");
        return _updateDatetime;
    }

    /**
     * [set] update_datetime: {NotNull, DATETIME(19)} <br>
     * @param updateDatetime The value of the column 'update_datetime'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateDatetime(java.time.LocalDateTime updateDatetime) {
        registerModifiedProperty("updateDatetime");
        _updateDatetime = updateDatetime;
    }

    /**
     * [get] update_trace: {NotNull, VARCHAR(64)} <br>
     * @return The value of the column 'update_trace'. (basically NotNull if selected: for the constraint)
     */
    public String getUpdateTrace() {
        checkSpecifiedProperty("updateTrace");
        return convertEmptyToNull(_updateTrace);
    }

    /**
     * [set] update_trace: {NotNull, VARCHAR(64)} <br>
     * @param updateTrace The value of the column 'update_trace'. (basically NotNull if update: for the constraint)
     */
    public void setUpdateTrace(String updateTrace) {
        registerModifiedProperty("updateTrace");
        _updateTrace = updateTrace;
    }
}
