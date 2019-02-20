package com.w11k.lsql.cli.tests;

import com.w11k.lsql.cli.tests.structural_fields.*;
import com.w11k.lsql.cli.tests.stmts1.*;
import java.util.*;

public class Stmts1 {

    // Statement: loadAllPersonsEscaped2 ----------------------------

    private final String sql_loadAllPersonsEscaped2 = "select \n person1.id as \"theId\" /*:int*/ \n from person1;";

    /**    
     * select<br>
     * person1.id as "theId" &#42;&#47;:int&#47;&#42;<br>
     * from person1;<br>
    */
    public loadAllPersonsEscaped2Query loadAllPersonsEscaped2() {
        return new loadAllPersonsEscaped2Query();
    }

    @SuppressWarnings({"Duplicates", "WeakerAccess"})
    public final class loadAllPersonsEscaped2Query extends com.w11k.lsql.TypedStatementQuery<LoadAllPersonsEscaped2> implements com.w11k.lsql.TableRow {

        // constructors ----------

        @SuppressWarnings("ConstantConditions")
        public loadAllPersonsEscaped2Query() {
            super(lSql, sql_loadAllPersonsEscaped2);
        }

        // fields ----------


        // class methods ----------

        public java.util.Map<String, Object> toInternalMap() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            return map;
        }

        public java.util.Map<String, Object> toRow() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            return map;
        }

        // Object methods ----------

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            loadAllPersonsEscaped2Query that = (loadAllPersonsEscaped2Query) o;
            return true;
        }

        @Override
        public int hashCode() {
            return Objects.hash("loadAllPersonsEscaped2Query");
        }

        @Override
        public String toString() {
            return "loadAllPersonsEscaped2Query{" + "" + "}";
        }

        protected LoadAllPersonsEscaped2 createTypedRow(com.w11k.lsql.Row row) {
            return LoadAllPersonsEscaped2.fromInternalMap(row);
        }

        protected java.util.Map<String, Object>  getQueryParameters() {
            return this.toInternalMap();
        }

        public String getStatementFileName() {
            return "Stmts1.sql";
        }

        public String getStatementName() {
            return "loadAllPersonsEscaped2";
        }

    }

    // Statement: loadAllPersons ----------------------------

    private final String sql_loadAllPersons = "select * from person1;";

    /**    
     * select * from person1;<br>
    */
    public loadAllPersonsQuery loadAllPersons() {
        return new loadAllPersonsQuery();
    }

    @SuppressWarnings({"Duplicates", "WeakerAccess"})
    public final class loadAllPersonsQuery extends com.w11k.lsql.TypedStatementQuery<LoadAllPersons> implements com.w11k.lsql.TableRow {

        // constructors ----------

        @SuppressWarnings("ConstantConditions")
        public loadAllPersonsQuery() {
            super(lSql, sql_loadAllPersons);
        }

        // fields ----------


        // class methods ----------

        public java.util.Map<String, Object> toInternalMap() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            return map;
        }

        public java.util.Map<String, Object> toRow() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            return map;
        }

        // Object methods ----------

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            loadAllPersonsQuery that = (loadAllPersonsQuery) o;
            return true;
        }

        @Override
        public int hashCode() {
            return Objects.hash("loadAllPersonsQuery");
        }

        @Override
        public String toString() {
            return "loadAllPersonsQuery{" + "" + "}";
        }

        protected LoadAllPersons createTypedRow(com.w11k.lsql.Row row) {
            return LoadAllPersons.fromInternalMap(row);
        }

        protected java.util.Map<String, Object>  getQueryParameters() {
            return this.toInternalMap();
        }

        public String getStatementFileName() {
            return "Stmts1.sql";
        }

        public String getStatementName() {
            return "loadAllPersons";
        }

    }

    // Statement: loadAllPersonsEscaped1 ----------------------------

    private final String sql_loadAllPersonsEscaped1 = "select \n person1.id as theId /*:int*/ \n from person1;";

    /**    
     * select<br>
     * person1.id as theId &#42;&#47;:int&#47;&#42;<br>
     * from person1;<br>
    */
    public loadAllPersonsEscaped1Query loadAllPersonsEscaped1() {
        return new loadAllPersonsEscaped1Query();
    }

    @SuppressWarnings({"Duplicates", "WeakerAccess"})
    public final class loadAllPersonsEscaped1Query extends com.w11k.lsql.TypedStatementQuery<LoadAllPersonsEscaped1> implements com.w11k.lsql.TableRow {

        // constructors ----------

        @SuppressWarnings("ConstantConditions")
        public loadAllPersonsEscaped1Query() {
            super(lSql, sql_loadAllPersonsEscaped1);
        }

        // fields ----------


        // class methods ----------

        public java.util.Map<String, Object> toInternalMap() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            return map;
        }

        public java.util.Map<String, Object> toRow() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            return map;
        }

        // Object methods ----------

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            loadAllPersonsEscaped1Query that = (loadAllPersonsEscaped1Query) o;
            return true;
        }

        @Override
        public int hashCode() {
            return Objects.hash("loadAllPersonsEscaped1Query");
        }

        @Override
        public String toString() {
            return "loadAllPersonsEscaped1Query{" + "" + "}";
        }

        protected LoadAllPersonsEscaped1 createTypedRow(com.w11k.lsql.Row row) {
            return LoadAllPersonsEscaped1.fromInternalMap(row);
        }

        protected java.util.Map<String, Object>  getQueryParameters() {
            return this.toInternalMap();
        }

        public String getStatementFileName() {
            return "Stmts1.sql";
        }

        public String getStatementName() {
            return "loadAllPersonsEscaped1";
        }

    }

    // Statement: keepUnderscoreForCamelCase ----------------------------

    private final String sql_keepUnderscoreForCamelCase = "select \n person1.id as \"a_field\" /*:int*/, \n person1.first_name as \"aField\" /*:string*/ \n from person1;";

    /**    
     * select<br>
     * person1.id as "a_field" &#42;&#47;:int&#47;&#42;,<br>
     * person1.first_name as "aField" &#42;&#47;:string&#47;&#42;<br>
     * from person1;<br>
    */
    public keepUnderscoreForCamelCaseQuery keepUnderscoreForCamelCase() {
        return new keepUnderscoreForCamelCaseQuery();
    }

    @SuppressWarnings({"Duplicates", "WeakerAccess"})
    public final class keepUnderscoreForCamelCaseQuery extends com.w11k.lsql.TypedStatementQuery<KeepUnderscoreForCamelCase> implements com.w11k.lsql.TableRow {

        // constructors ----------

        @SuppressWarnings("ConstantConditions")
        public keepUnderscoreForCamelCaseQuery() {
            super(lSql, sql_keepUnderscoreForCamelCase);
        }

        // fields ----------


        // class methods ----------

        public java.util.Map<String, Object> toInternalMap() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            return map;
        }

        public java.util.Map<String, Object> toRow() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            return map;
        }

        // Object methods ----------

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            keepUnderscoreForCamelCaseQuery that = (keepUnderscoreForCamelCaseQuery) o;
            return true;
        }

        @Override
        public int hashCode() {
            return Objects.hash("keepUnderscoreForCamelCaseQuery");
        }

        @Override
        public String toString() {
            return "keepUnderscoreForCamelCaseQuery{" + "" + "}";
        }

        protected KeepUnderscoreForCamelCase createTypedRow(com.w11k.lsql.Row row) {
            return KeepUnderscoreForCamelCase.fromInternalMap(row);
        }

        protected java.util.Map<String, Object>  getQueryParameters() {
            return this.toInternalMap();
        }

        public String getStatementFileName() {
            return "Stmts1.sql";
        }

        public String getStatementName() {
            return "keepUnderscoreForCamelCase";
        }

    }

    // Statement: queryParamsWithDot ----------------------------

    private final String sql_queryParamsWithDot = "select \n person1.* \n from person1 \n WHERE \n person1.id = /*=*/ 1 /**/;";

    /**    
     * select<br>
     * person1.*<br>
     * from person1<br>
     * WHERE<br>
     * person1.id = &#42;&#47;=&#47;&#42; 1 &#42;&#47;&#47;&#42;;<br>
    */
    public queryParamsWithDotQuery queryParamsWithDot() {
        return new queryParamsWithDotQuery();
    }

    @SuppressWarnings({"Duplicates", "WeakerAccess"})
    public final class queryParamsWithDotQuery extends com.w11k.lsql.TypedStatementQuery<QueryParamsWithDot> implements com.w11k.lsql.TableRow, Person1Id_Number {

        // constructors ----------

        @SuppressWarnings("ConstantConditions")
        public queryParamsWithDotQuery() {
            super(lSql, sql_queryParamsWithDot);
            this.person1Id = null;
        }

        @SuppressWarnings("NullableProblems")
        private queryParamsWithDotQuery(
                java.lang.Number person1Id) {
            super(lSql, sql_queryParamsWithDot);
            this.person1Id = person1Id;
    }

        // fields ----------

        @javax.annotation.Nullable public final java.lang.Number person1Id;

        @javax.annotation.Nullable public java.lang.Number getPerson1Id() {
            return this.person1Id;
        }

        public queryParamsWithDotQuery withPerson1Id(@javax.annotation.Nullable java.lang.Number person1Id) {
            return new queryParamsWithDotQuery(person1Id);
        }

        // class methods ----------

        public java.util.Map<String, Object> toInternalMap() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            map.put("person1.id", this.person1Id);
            return map;
        }

        public java.util.Map<String, Object> toRow() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            map.put("person1Id", this.person1Id);
            return map;
        }

        // Object methods ----------

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            queryParamsWithDotQuery that = (queryParamsWithDotQuery) o;
            return     Objects.equals(person1Id, that.person1Id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(person1Id);
        }

        @Override
        public String toString() {
            return "queryParamsWithDotQuery{" + "person1Id=" + person1Id + "}";
        }

        protected QueryParamsWithDot createTypedRow(com.w11k.lsql.Row row) {
            return QueryParamsWithDot.fromInternalMap(row);
        }

        protected java.util.Map<String, Object>  getQueryParameters() {
            return this.toInternalMap();
        }

        public String getStatementFileName() {
            return "Stmts1.sql";
        }

        public String getStatementName() {
            return "queryParamsWithDot";
        }

    }

    // Statement: changeYesno ----------------------------

    private final String sql_changeYesno = "UPDATE checks \n SET yesno = /*=*/ TRUE /**/ \n ;";

    /**    
     * UPDATE checks<br>
     * SET yesno = &#42;&#47;=&#47;&#42; TRUE &#42;&#47;&#47;&#42;<br>
     * ;<br>
    */
    public changeYesnoQuery changeYesno() {
        return new changeYesnoQuery();
    }

    @SuppressWarnings({"Duplicates", "WeakerAccess"})
    public final class changeYesnoQuery extends com.w11k.lsql.TypedStatementCommand implements com.w11k.lsql.TableRow, Yesno_Boolean {

        // constructors ----------

        @SuppressWarnings("ConstantConditions")
        public changeYesnoQuery() {
            super(lSql, sql_changeYesno);
            this.yesno = null;
        }

        @SuppressWarnings("NullableProblems")
        private changeYesnoQuery(
                java.lang.Boolean yesno) {
            super(lSql, sql_changeYesno);
            this.yesno = yesno;
    }

        // fields ----------

        @javax.annotation.Nullable public final java.lang.Boolean yesno;

        @javax.annotation.Nullable public java.lang.Boolean isYesno() {
            return this.yesno;
        }

        public changeYesnoQuery withYesno(@javax.annotation.Nullable java.lang.Boolean yesno) {
            return new changeYesnoQuery(yesno);
        }

        // class methods ----------

        public java.util.Map<String, Object> toInternalMap() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            map.put("yesno", this.yesno);
            return map;
        }

        public java.util.Map<String, Object> toRow() {
            java.util.Map<String, Object> map = new java.util.HashMap<>();
            map.put("yesno", this.yesno);
            return map;
        }

        // Object methods ----------

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            changeYesnoQuery that = (changeYesnoQuery) o;
            return     Objects.equals(yesno, that.yesno);
        }

        @Override
        public int hashCode() {
            return Objects.hash(yesno);
        }

        @Override
        public String toString() {
            return "changeYesnoQuery{" + "yesno=" + yesno + "}";
        }

        protected java.util.Map<String, Object>  getQueryParameters() {
            return this.toInternalMap();
        }

        public String getStatementFileName() {
            return "Stmts1.sql";
        }

        public String getStatementName() {
            return "changeYesno";
        }

    }

    private final com.w11k.lsql.LSql lSql;

    @com.google.inject.Inject
    public Stmts1(com.w11k.lsql.LSql lSql) {
        this.lSql = lSql;
    }

}
