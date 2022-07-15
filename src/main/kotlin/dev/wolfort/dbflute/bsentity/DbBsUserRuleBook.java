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
 * The entity of USER_RULE_BOOK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     user_rule_book_id
 *
 * [column]
 *     user_rule_book_id, user_id, rule_book_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     user_rule_book_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     RULE_BOOK, USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     ruleBook, user
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer userRuleBookId = entity.getUserRuleBookId();
 * Integer userId = entity.getUserId();
 * Integer ruleBookId = entity.getRuleBookId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setUserRuleBookId(userRuleBookId);
 * entity.setUserId(userId);
 * entity.setRuleBookId(ruleBookId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsUserRuleBook extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** user_rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _userRuleBookId;

    /** user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user} */
    protected Integer _userId;

    /** rule_book_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to rule_book} */
    protected Integer _ruleBookId;

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
        return "user_rule_book";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userRuleBookId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param userId : UQ+, NotNull, INT UNSIGNED(10), FK to user. (NotNull)
     * @param ruleBookId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to rule_book. (NotNull)
     */
    public void uniqueBy(Integer userId, Integer ruleBookId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("userId");
        __uniqueDrivenProperties.addPropertyName("ruleBookId");
        setUserId(userId);setRuleBookId(ruleBookId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** RULE_BOOK by my rule_book_id, named 'ruleBook'. */
    protected OptionalEntity<DbRuleBook> _ruleBook;

    /**
     * [get] RULE_BOOK by my rule_book_id, named 'ruleBook'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'ruleBook'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbRuleBook> getRuleBook() {
        if (_ruleBook == null) { _ruleBook = OptionalEntity.relationEmpty(this, "ruleBook"); }
        return _ruleBook;
    }

    /**
     * [set] RULE_BOOK by my rule_book_id, named 'ruleBook'.
     * @param ruleBook The entity of foreign property 'ruleBook'. (NullAllowed)
     */
    public void setRuleBook(OptionalEntity<DbRuleBook> ruleBook) {
        _ruleBook = ruleBook;
    }

    /** USER by my user_id, named 'user'. */
    protected OptionalEntity<DbUser> _user;

    /**
     * [get] USER by my user_id, named 'user'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'user'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbUser> getUser() {
        if (_user == null) { _user = OptionalEntity.relationEmpty(this, "user"); }
        return _user;
    }

    /**
     * [set] USER by my user_id, named 'user'.
     * @param user The entity of foreign property 'user'. (NullAllowed)
     */
    public void setUser(OptionalEntity<DbUser> user) {
        _user = user;
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
        if (obj instanceof DbBsUserRuleBook) {
            DbBsUserRuleBook other = (DbBsUserRuleBook)obj;
            if (!xSV(_userRuleBookId, other._userRuleBookId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userRuleBookId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_ruleBook != null && _ruleBook.isPresent())
        { sb.append(li).append(xbRDS(_ruleBook, "ruleBook")); }
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userRuleBookId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_ruleBookId));
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
        if (_ruleBook != null && _ruleBook.isPresent())
        { sb.append(dm).append("ruleBook"); }
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbUserRuleBook clone() {
        return (DbUserRuleBook)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] user_rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'user_rule_book_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserRuleBookId() {
        checkSpecifiedProperty("userRuleBookId");
        return _userRuleBookId;
    }

    /**
     * [set] user_rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param userRuleBookId The value of the column 'user_rule_book_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserRuleBookId(Integer userRuleBookId) {
        registerModifiedProperty("userRuleBookId");
        _userRuleBookId = userRuleBookId;
    }

    /**
     * [get] user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @return The value of the column 'user_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user} <br>
     * @param userId The value of the column 'user_id'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Integer userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] rule_book_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to rule_book} <br>
     * @return The value of the column 'rule_book_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRuleBookId() {
        checkSpecifiedProperty("ruleBookId");
        return _ruleBookId;
    }

    /**
     * [set] rule_book_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to rule_book} <br>
     * @param ruleBookId The value of the column 'rule_book_id'. (basically NotNull if update: for the constraint)
     */
    public void setRuleBookId(Integer ruleBookId) {
        registerModifiedProperty("ruleBookId");
        _ruleBookId = ruleBookId;
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
