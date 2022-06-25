package dev.wolfort.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import dev.wolfort.dbflute.allcommon.DbEntityDefinedCommonColumn;
import dev.wolfort.dbflute.allcommon.DbDBMetaInstanceHandler;
import dev.wolfort.dbflute.exentity.*;

/**
 * The entity of USER as TABLE. <br>
 * <pre>
 * [primary-key]
 *     user_id
 *
 * [column]
 *     user_id, user_name, uid, twitter_user_name, authority, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     user_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     PARTICIPATE, USER_FOLLOW
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     participateList, userFollowByFromUserIdList, userFollowByToUserIdList
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userId = entity.getUserId();
 * String userName = entity.getUserName();
 * String uid = entity.getUid();
 * String twitterUserName = entity.getTwitterUserName();
 * String authority = entity.getAuthority();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setUserId(userId);
 * entity.setUserName(userName);
 * entity.setUid(uid);
 * entity.setTwitterUserName(twitterUserName);
 * entity.setAuthority(authority);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsUser extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** user_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _userId;

    /** user_name: {NotNull, VARCHAR(50)} */
    protected String _userName;

    /** uid: {UQ, NotNull, VARCHAR(255)} */
    protected String _uid;

    /** twitter_user_name: {VARCHAR(50)} */
    protected String _twitterUserName;

    /** authority: {NotNull, VARCHAR(50)} */
    protected String _authority;

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
        return "user";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param uid : UQ, NotNull, VARCHAR(255). (NotNull)
     */
    public void uniqueBy(String uid) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("uid");
        setUid(uid);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** PARTICIPATE by user_id, named 'participateList'. */
    protected List<DbParticipate> _participateList;

    /**
     * [get] PARTICIPATE by user_id, named 'participateList'.
     * @return The entity list of referrer property 'participateList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbParticipate> getParticipateList() {
        if (_participateList == null) { _participateList = newReferrerList(); }
        return _participateList;
    }

    /**
     * [set] PARTICIPATE by user_id, named 'participateList'.
     * @param participateList The entity list of referrer property 'participateList'. (NullAllowed)
     */
    public void setParticipateList(List<DbParticipate> participateList) {
        _participateList = participateList;
    }

    /** USER_FOLLOW by from_user_id, named 'userFollowByFromUserIdList'. */
    protected List<DbUserFollow> _userFollowByFromUserIdList;

    /**
     * [get] USER_FOLLOW by from_user_id, named 'userFollowByFromUserIdList'.
     * @return The entity list of referrer property 'userFollowByFromUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbUserFollow> getUserFollowByFromUserIdList() {
        if (_userFollowByFromUserIdList == null) { _userFollowByFromUserIdList = newReferrerList(); }
        return _userFollowByFromUserIdList;
    }

    /**
     * [set] USER_FOLLOW by from_user_id, named 'userFollowByFromUserIdList'.
     * @param userFollowByFromUserIdList The entity list of referrer property 'userFollowByFromUserIdList'. (NullAllowed)
     */
    public void setUserFollowByFromUserIdList(List<DbUserFollow> userFollowByFromUserIdList) {
        _userFollowByFromUserIdList = userFollowByFromUserIdList;
    }

    /** USER_FOLLOW by to_user_id, named 'userFollowByToUserIdList'. */
    protected List<DbUserFollow> _userFollowByToUserIdList;

    /**
     * [get] USER_FOLLOW by to_user_id, named 'userFollowByToUserIdList'.
     * @return The entity list of referrer property 'userFollowByToUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<DbUserFollow> getUserFollowByToUserIdList() {
        if (_userFollowByToUserIdList == null) { _userFollowByToUserIdList = newReferrerList(); }
        return _userFollowByToUserIdList;
    }

    /**
     * [set] USER_FOLLOW by to_user_id, named 'userFollowByToUserIdList'.
     * @param userFollowByToUserIdList The entity list of referrer property 'userFollowByToUserIdList'. (NullAllowed)
     */
    public void setUserFollowByToUserIdList(List<DbUserFollow> userFollowByToUserIdList) {
        _userFollowByToUserIdList = userFollowByToUserIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof DbBsUser) {
            DbBsUser other = (DbBsUser)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_participateList != null) { for (DbParticipate et : _participateList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "participateList")); } } }
        if (_userFollowByFromUserIdList != null) { for (DbUserFollow et : _userFollowByFromUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userFollowByFromUserIdList")); } } }
        if (_userFollowByToUserIdList != null) { for (DbUserFollow et : _userFollowByToUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userFollowByToUserIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_userName));
        sb.append(dm).append(xfND(_uid));
        sb.append(dm).append(xfND(_twitterUserName));
        sb.append(dm).append(xfND(_authority));
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
        if (_participateList != null && !_participateList.isEmpty())
        { sb.append(dm).append("participateList"); }
        if (_userFollowByFromUserIdList != null && !_userFollowByFromUserIdList.isEmpty())
        { sb.append(dm).append("userFollowByFromUserIdList"); }
        if (_userFollowByToUserIdList != null && !_userFollowByToUserIdList.isEmpty())
        { sb.append(dm).append("userFollowByToUserIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbUser clone() {
        return (DbUser)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] user_name: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'user_name'. (basically NotNull if selected: for the constraint)
     */
    public String getUserName() {
        checkSpecifiedProperty("userName");
        return convertEmptyToNull(_userName);
    }

    /**
     * [set] user_name: {NotNull, VARCHAR(50)} <br>
     * @param userName The value of the column 'user_name'. (basically NotNull if update: for the constraint)
     */
    public void setUserName(String userName) {
        registerModifiedProperty("userName");
        _userName = userName;
    }

    /**
     * [get] uid: {UQ, NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'uid'. (basically NotNull if selected: for the constraint)
     */
    public String getUid() {
        checkSpecifiedProperty("uid");
        return convertEmptyToNull(_uid);
    }

    /**
     * [set] uid: {UQ, NotNull, VARCHAR(255)} <br>
     * @param uid The value of the column 'uid'. (basically NotNull if update: for the constraint)
     */
    public void setUid(String uid) {
        registerModifiedProperty("uid");
        _uid = uid;
    }

    /**
     * [get] twitter_user_name: {VARCHAR(50)} <br>
     * @return The value of the column 'twitter_user_name'. (NullAllowed even if selected: for no constraint)
     */
    public String getTwitterUserName() {
        checkSpecifiedProperty("twitterUserName");
        return convertEmptyToNull(_twitterUserName);
    }

    /**
     * [set] twitter_user_name: {VARCHAR(50)} <br>
     * @param twitterUserName The value of the column 'twitter_user_name'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTwitterUserName(String twitterUserName) {
        registerModifiedProperty("twitterUserName");
        _twitterUserName = twitterUserName;
    }

    /**
     * [get] authority: {NotNull, VARCHAR(50)} <br>
     * @return The value of the column 'authority'. (basically NotNull if selected: for the constraint)
     */
    public String getAuthority() {
        checkSpecifiedProperty("authority");
        return convertEmptyToNull(_authority);
    }

    /**
     * [set] authority: {NotNull, VARCHAR(50)} <br>
     * @param authority The value of the column 'authority'. (basically NotNull if update: for the constraint)
     */
    public void setAuthority(String authority) {
        registerModifiedProperty("authority");
        _authority = authority;
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
