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
 * The entity of PARTICIPATE_RULE_BOOK as TABLE. <br>
 * <pre>
 * [primary-key]
 *     participate_rule_book_id
 *
 * [column]
 *     participate_rule_book_id, participate_id, rule_book_id, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     participate_rule_book_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     PARTICIPATE, RULE_BOOK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     participate, ruleBook
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer participateRuleBookId = entity.getParticipateRuleBookId();
 * Integer participateId = entity.getParticipateId();
 * Integer ruleBookId = entity.getRuleBookId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setParticipateRuleBookId(participateRuleBookId);
 * entity.setParticipateId(participateId);
 * entity.setRuleBookId(ruleBookId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsParticipateRuleBook extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** participate_rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _participateRuleBookId;

    /** participate_id: {UQ+, NotNull, INT UNSIGNED(10), FK to participate} */
    protected Integer _participateId;

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
        return "participate_rule_book";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_participateRuleBookId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param participateId : UQ+, NotNull, INT UNSIGNED(10), FK to participate. (NotNull)
     * @param ruleBookId : +UQ, IX, NotNull, INT UNSIGNED(10), FK to rule_book. (NotNull)
     */
    public void uniqueBy(Integer participateId, Integer ruleBookId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("participateId");
        __uniqueDrivenProperties.addPropertyName("ruleBookId");
        setParticipateId(participateId);setRuleBookId(ruleBookId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** PARTICIPATE by my participate_id, named 'participate'. */
    protected OptionalEntity<DbParticipate> _participate;

    /**
     * [get] PARTICIPATE by my participate_id, named 'participate'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'participate'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<DbParticipate> getParticipate() {
        if (_participate == null) { _participate = OptionalEntity.relationEmpty(this, "participate"); }
        return _participate;
    }

    /**
     * [set] PARTICIPATE by my participate_id, named 'participate'.
     * @param participate The entity of foreign property 'participate'. (NullAllowed)
     */
    public void setParticipate(OptionalEntity<DbParticipate> participate) {
        _participate = participate;
    }

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
        if (obj instanceof DbBsParticipateRuleBook) {
            DbBsParticipateRuleBook other = (DbBsParticipateRuleBook)obj;
            if (!xSV(_participateRuleBookId, other._participateRuleBookId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _participateRuleBookId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_participate != null && _participate.isPresent())
        { sb.append(li).append(xbRDS(_participate, "participate")); }
        if (_ruleBook != null && _ruleBook.isPresent())
        { sb.append(li).append(xbRDS(_ruleBook, "ruleBook")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_participateRuleBookId));
        sb.append(dm).append(xfND(_participateId));
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
        if (_participate != null && _participate.isPresent())
        { sb.append(dm).append("participate"); }
        if (_ruleBook != null && _ruleBook.isPresent())
        { sb.append(dm).append("ruleBook"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbParticipateRuleBook clone() {
        return (DbParticipateRuleBook)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] participate_rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'participate_rule_book_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getParticipateRuleBookId() {
        checkSpecifiedProperty("participateRuleBookId");
        return _participateRuleBookId;
    }

    /**
     * [set] participate_rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param participateRuleBookId The value of the column 'participate_rule_book_id'. (basically NotNull if update: for the constraint)
     */
    public void setParticipateRuleBookId(Integer participateRuleBookId) {
        registerModifiedProperty("participateRuleBookId");
        _participateRuleBookId = participateRuleBookId;
    }

    /**
     * [get] participate_id: {UQ+, NotNull, INT UNSIGNED(10), FK to participate} <br>
     * @return The value of the column 'participate_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getParticipateId() {
        checkSpecifiedProperty("participateId");
        return _participateId;
    }

    /**
     * [set] participate_id: {UQ+, NotNull, INT UNSIGNED(10), FK to participate} <br>
     * @param participateId The value of the column 'participate_id'. (basically NotNull if update: for the constraint)
     */
    public void setParticipateId(Integer participateId) {
        registerModifiedProperty("participateId");
        _participateId = participateId;
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
