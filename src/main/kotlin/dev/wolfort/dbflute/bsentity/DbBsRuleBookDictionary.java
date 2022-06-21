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
 * The entity of RULE_BOOK_DICTIONARY as TABLE. <br>
 * <pre>
 * [primary-key]
 *     rule_book_dictionary_id
 *
 * [column]
 *     rule_book_dictionary_id, rule_book_id, rule_book_name, register_datetime, register_trace, update_datetime, update_trace
 *
 * [sequence]
 *     
 *
 * [identity]
 *     rule_book_dictionary_id
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     RULE_BOOK
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     ruleBook
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer ruleBookDictionaryId = entity.getRuleBookDictionaryId();
 * Integer ruleBookId = entity.getRuleBookId();
 * String ruleBookName = entity.getRuleBookName();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String registerTrace = entity.getRegisterTrace();
 * java.time.LocalDateTime updateDatetime = entity.getUpdateDatetime();
 * String updateTrace = entity.getUpdateTrace();
 * entity.setRuleBookDictionaryId(ruleBookDictionaryId);
 * entity.setRuleBookId(ruleBookId);
 * entity.setRuleBookName(ruleBookName);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setRegisterTrace(registerTrace);
 * entity.setUpdateDatetime(updateDatetime);
 * entity.setUpdateTrace(updateTrace);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class DbBsRuleBookDictionary extends AbstractEntity implements DomainEntity, DbEntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** rule_book_dictionary_id: {PK, ID, NotNull, INT UNSIGNED(10)} */
    protected Integer _ruleBookDictionaryId;

    /** rule_book_id: {IX, INT UNSIGNED(10), FK to rule_book} */
    protected Integer _ruleBookId;

    /** rule_book_name: {NotNull, VARCHAR(255)} */
    protected String _ruleBookName;

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
        return "rule_book_dictionary";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_ruleBookDictionaryId == null) { return false; }
        return true;
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
        if (obj instanceof DbBsRuleBookDictionary) {
            DbBsRuleBookDictionary other = (DbBsRuleBookDictionary)obj;
            if (!xSV(_ruleBookDictionaryId, other._ruleBookDictionaryId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _ruleBookDictionaryId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
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
        sb.append(dm).append(xfND(_ruleBookDictionaryId));
        sb.append(dm).append(xfND(_ruleBookId));
        sb.append(dm).append(xfND(_ruleBookName));
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
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public DbRuleBookDictionary clone() {
        return (DbRuleBookDictionary)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] rule_book_dictionary_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @return The value of the column 'rule_book_dictionary_id'. (basically NotNull if selected: for the constraint)
     */
    public Integer getRuleBookDictionaryId() {
        checkSpecifiedProperty("ruleBookDictionaryId");
        return _ruleBookDictionaryId;
    }

    /**
     * [set] rule_book_dictionary_id: {PK, ID, NotNull, INT UNSIGNED(10)} <br>
     * @param ruleBookDictionaryId The value of the column 'rule_book_dictionary_id'. (basically NotNull if update: for the constraint)
     */
    public void setRuleBookDictionaryId(Integer ruleBookDictionaryId) {
        registerModifiedProperty("ruleBookDictionaryId");
        _ruleBookDictionaryId = ruleBookDictionaryId;
    }

    /**
     * [get] rule_book_id: {IX, INT UNSIGNED(10), FK to rule_book} <br>
     * @return The value of the column 'rule_book_id'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getRuleBookId() {
        checkSpecifiedProperty("ruleBookId");
        return _ruleBookId;
    }

    /**
     * [set] rule_book_id: {IX, INT UNSIGNED(10), FK to rule_book} <br>
     * @param ruleBookId The value of the column 'rule_book_id'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRuleBookId(Integer ruleBookId) {
        registerModifiedProperty("ruleBookId");
        _ruleBookId = ruleBookId;
    }

    /**
     * [get] rule_book_name: {NotNull, VARCHAR(255)} <br>
     * @return The value of the column 'rule_book_name'. (basically NotNull if selected: for the constraint)
     */
    public String getRuleBookName() {
        checkSpecifiedProperty("ruleBookName");
        return convertEmptyToNull(_ruleBookName);
    }

    /**
     * [set] rule_book_name: {NotNull, VARCHAR(255)} <br>
     * @param ruleBookName The value of the column 'rule_book_name'. (basically NotNull if update: for the constraint)
     */
    public void setRuleBookName(String ruleBookName) {
        registerModifiedProperty("ruleBookName");
        _ruleBookName = ruleBookName;
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
