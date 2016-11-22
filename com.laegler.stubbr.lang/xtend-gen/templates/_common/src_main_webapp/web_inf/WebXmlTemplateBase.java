package templates._common.src_main_webapp.web_inf;

import com.laegler.stubbr.lang.genmodel.Project;
import com.laegler.stubbr.lang.genmodel.StubbrRegistry;
import org.eclipse.xtend2.lib.StringConcatenation;
import templates.AbstractXmlTemplate;

/**
 * File Generator for Web project descriptor.
 */
@SuppressWarnings("all")
public class WebXmlTemplateBase extends AbstractXmlTemplate {
  public WebXmlTemplateBase(final StubbrRegistry stubbr, final Project project) {
    super(stubbr, project);
    this.setFileName("web");
    this.setRelativPath("/src/main/webapp/WEB-INF/");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<web-app");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xmlns=\"http://java.sun.com/xml/ns/javaee\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("xsi:schemaLocation=\"http://java.sun.com/xml/ns/javaee");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd\"");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("version=\"3.0\">");
    _builder.newLine();
    this.setHeader(_builder.toString());
    this.setFooter("</web-app>");
    this.setDocumentation("Web project descriptor");
  }
  
  @Override
  public String getTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<display-name>pmbok-web</display-name>");
    _builder.newLine();
    _builder.append("<description>The WebApp Project. Containing Servlets and Filters, Security and Roles, Session and Cookie Timeouts and much more :)</description>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<welcome-file-list>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<welcome-file>index.jsf</welcome-file>");
    _builder.newLine();
    _builder.append("</welcome-file-list>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Citysquire Faces Servlet -->");
    _builder.newLine();
    _builder.append("<servlet>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<servlet-name>CQFacesServlet</servlet-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<servlet-class>javax.faces.webapp.FacesServlet</servlet-class>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- <servlet-class>com.laegler.pmbok.web.servlet.CQFacesServlet</servlet-class> -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<load-on-startup>1</load-on-startup>");
    _builder.newLine();
    _builder.append("</servlet>");
    _builder.newLine();
    _builder.append("<servlet-mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<servlet-name>CQFacesServlet</servlet-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<url-pattern>*.jsf</url-pattern>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<url-pattern>*.xhtml</url-pattern>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<url-pattern>*.html</url-pattern>");
    _builder.newLine();
    _builder.append("</servlet-mapping>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Citysquire Faces Filter -->");
    _builder.newLine();
    _builder.append("<filter>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Citysquire Faces Filter</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<display-name>Citysquire Faces Filter</display-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<filter-name>CQFacesFilter</filter-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<filter-class>com.laegler.pmbok.web.servlet.CQFacesFilter</filter-class>");
    _builder.newLine();
    _builder.append("</filter>");
    _builder.newLine();
    _builder.append("<filter-mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<filter-name>CQFacesFilter</filter-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<url-pattern>*.jsf</url-pattern>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<url-pattern>*.xhtml</url-pattern>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<url-pattern>*.html</url-pattern>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<servlet-name>CQUploadServlet</servlet-name>");
    _builder.newLine();
    _builder.append("</filter-mapping>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Upload Servlet -->");
    _builder.newLine();
    _builder.append("<servlet>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<servlet-name>CQUploadServlet</servlet-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<servlet-class>com.laegler.pmbok.web.servlet.CQUploadServlet</servlet-class>");
    _builder.newLine();
    _builder.append("</servlet>");
    _builder.newLine();
    _builder.append("<servlet-mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<servlet-name>CQUploadServlet</servlet-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<url-pattern>/upload/*</url-pattern>");
    _builder.newLine();
    _builder.append("</servlet-mapping>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Upload Filter -->");
    _builder.newLine();
    _builder.append("<filter>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Custom citysquire file upload filter</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<display-name>Custom citysquire file upload filter</display-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<filter-name>CQUploadFilter</filter-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<filter-class>com.laegler.pmbok.web.servlet.CQUploadFilter</filter-class>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<init-param>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<param-name>thresholdSize</param-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<param-value>51200</param-value>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</init-param>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<init-param>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<param-name>uploadDirectory</param-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<param-value>D:\\Users\\thomas\\Desktop</param-value>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</init-param>");
    _builder.newLine();
    _builder.append("</filter>");
    _builder.newLine();
    _builder.append("<filter-mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<filter-name>CQUploadFilter</filter-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<servlet-name>CQUploadServlet</servlet-name>");
    _builder.newLine();
    _builder.append("</filter-mapping>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<filter>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<filter-name>WeldCrossContextFilter</filter-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<filter-class>org.jboss.weld.servlet.WeldCrossContextFilter</filter-class>");
    _builder.newLine();
    _builder.append("</filter>");
    _builder.newLine();
    _builder.append("<filter-mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<filter-name>WeldCrossContextFilter</filter-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<url-pattern>/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dispatcher>INCLUDE</dispatcher>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dispatcher>FORWARD</dispatcher>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dispatcher>ERROR</dispatcher>");
    _builder.newLine();
    _builder.append("</filter-mapping>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Context Parameters -->");
    _builder.newLine();
    _builder.append("<context-param>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-name>configuration</param-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-value>deployment</param-value>");
    _builder.newLine();
    _builder.append("</context-param>");
    _builder.newLine();
    _builder.append("<context-param>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-name>primefaces.UPLOADER</param-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-value>commons</param-value>");
    _builder.newLine();
    _builder.append("</context-param>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<context-param>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-name>upload.location</param-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-value>/var/www/upload/</param-value>");
    _builder.newLine();
    _builder.append("</context-param>");
    _builder.newLine();
    _builder.append("<context-param>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>State saving method (see JSF specification 2.5.2)</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-name>javax.faces.STATE_SAVING_METHOD</param-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-value>server</param-value>");
    _builder.newLine();
    _builder.append("</context-param>");
    _builder.newLine();
    _builder.append("<context-param>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Location of faces config</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-name>javax.faces.application.CONFIG_FILES</param-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-value>/WEB-INF/faces-config.xml</param-value>");
    _builder.newLine();
    _builder.append("</context-param>");
    _builder.newLine();
    _builder.append("<context-param>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Enable client side validation for Primefaces</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-name>primefaces.CLIENT_SIDE_VALIDATION</param-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-value>true</param-value>");
    _builder.newLine();
    _builder.append("</context-param>");
    _builder.newLine();
    _builder.append("<context-param>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Prevent rendering of comments in XHTML files (legacy: facelets.SKIP_COMMENTS)</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-name>javax.faces.FACELETS_SKIP_COMMENTS</param-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-value>true</param-value>");
    _builder.newLine();
    _builder.append("</context-param>");
    _builder.newLine();
    _builder.append("<context-param>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Custom citysquire facelet function taglib</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-name>javax.faces.FACELETS_LIBRARIES</param-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-value>/WEB-INF/cqFaceletFunctions.taglib.xml</param-value>");
    _builder.newLine();
    _builder.append("</context-param>");
    _builder.newLine();
    _builder.append("<context-param>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Specify Primefaces theming</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-name>primefaces.THEME</param-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<param-value>delta</param-value>");
    _builder.newLine();
    _builder.append("</context-param>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Session Config -->");
    _builder.newLine();
    _builder.append("<session-config>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<session-timeout>1000</session-timeout>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<tracking-mode>COOKIE</tracking-mode>");
    _builder.newLine();
    _builder.append("</session-config>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Listener -->");
    _builder.newLine();
    _builder.append("<listener>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<display-name>Custom citysquire Servlet context listener</display-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<listener-class>com.laegler.pmbok.web.servlet.CQServletContextListener</listener-class>");
    _builder.newLine();
    _builder.append("</listener>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Error Pages -->");
    _builder.newLine();
    _builder.append("<error-page>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<error-code>401</error-code>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<location>/desktop/error-pages/401.xhtml</location>");
    _builder.newLine();
    _builder.append("</error-page>");
    _builder.newLine();
    _builder.append("<error-page>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<error-code>404</error-code>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<location>/desktop/error-pages/404.xhtml</location>");
    _builder.newLine();
    _builder.append("</error-page>");
    _builder.newLine();
    _builder.append("<error-page>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<error-code>403</error-code>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<location>/desktop/error-pages/403.xhtml</location>");
    _builder.newLine();
    _builder.append("</error-page>");
    _builder.newLine();
    _builder.append("<error-page>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<exception-type>java.lang.Exception</exception-type>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<location>/desktop/error-pages/error.xhtml</location>");
    _builder.newLine();
    _builder.append("</error-page>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Security -->");
    _builder.newLine();
    _builder.append("<security-constraint>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<display-name>SuperuserAccess</display-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<web-resource-collection>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<web-resource-name>SuperuserArea</web-resource-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/desktop/superuser/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/mobile/superuser/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>GET</http-method>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>POST</http-method>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</web-resource-collection>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<auth-constraint>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<description>Constraint for Superuser</description>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>SUPERUSER</role-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</auth-constraint>");
    _builder.newLine();
    _builder.append("</security-constraint>");
    _builder.newLine();
    _builder.append("<security-constraint>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<display-name>AdminAccess</display-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<web-resource-collection>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<web-resource-name>>AdminArea</web-resource-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/desktop/admin/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/mobile/admin/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>GET</http-method>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>POST</http-method>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</web-resource-collection>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<auth-constraint>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<description>Constraint for Admin, Superuser</description>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>SUPERUSER</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>ADMIN</role-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</auth-constraint>");
    _builder.newLine();
    _builder.append("</security-constraint>");
    _builder.newLine();
    _builder.append("<security-constraint>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<display-name>ManagementAccess</display-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<web-resource-collection>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<web-resource-name>ManagementArea</web-resource-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/desktop/management/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/mobile/management/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>GET</http-method>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>POST</http-method>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</web-resource-collection>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<auth-constraint>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<description>Constraint for Superuser, Admin, Management</description>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>SUPERUSER</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>ADMIN</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>MANAGEMENT</role-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</auth-constraint>");
    _builder.newLine();
    _builder.append("</security-constraint>");
    _builder.newLine();
    _builder.append("<security-constraint>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<display-name>EnterpriseAccess</display-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<web-resource-collection>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<web-resource-name>SuperuserArea</web-resource-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/desktop/enterprise/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/mobile/enterprise/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>GET</http-method>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>POST</http-method>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</web-resource-collection>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<auth-constraint>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<description>Constraint for Superuser, Admin, Management,");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("Enterprise</description>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>SUPERUSER</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>ADMIN</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>MANAGEMENT</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>ENTERPRISE</role-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</auth-constraint>");
    _builder.newLine();
    _builder.append("</security-constraint>");
    _builder.newLine();
    _builder.append("<security-constraint>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<display-name>ProviderAccess</display-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<web-resource-collection>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<web-resource-name>ProviderArea</web-resource-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/desktop/provider/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/mobile/provider/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>GET</http-method>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>POST</http-method>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</web-resource-collection>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<auth-constraint>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<description>Constraint for Superuser, Admin, Management,");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("Provider</description>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>SUPERUSER</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>ADMIN</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>MANAGEMENT</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>PROVIDER</role-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</auth-constraint>");
    _builder.newLine();
    _builder.append("</security-constraint>");
    _builder.newLine();
    _builder.append("<security-constraint>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<display-name>EmployeeAccess</display-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<web-resource-collection>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<web-resource-name>ProviderArea</web-resource-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/desktop/employee/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/mobile/employee/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>GET</http-method>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>POST</http-method>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</web-resource-collection>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<auth-constraint>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<description>Constraint for Superuser, Admin, Management,");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("Employee</description>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>SUPERUSER</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>ADMIN</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>MANAGEMENT</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>EMPLOYEE</role-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</auth-constraint>");
    _builder.newLine();
    _builder.append("</security-constraint>");
    _builder.newLine();
    _builder.append("<security-constraint>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<display-name>GuestAccess</display-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<web-resource-collection>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<web-resource-name>GuestArea</web-resource-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/desktop/guest/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<url-pattern>/mobile/guest/*</url-pattern>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>GET</http-method>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<http-method>POST</http-method>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</web-resource-collection>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<auth-constraint>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<description>Constraint for Superuser, Admin, Management, Enterprise");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Provider, Employee</description>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>SUPERUSER</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>ADMIN</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>MANAGEMENT</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>ENTERPRISE</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>PROVIDER</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>EMPLOYEE</role-name>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<role-name>GUEST</role-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</auth-constraint>");
    _builder.newLine();
    _builder.append("</security-constraint>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Login Config -->");
    _builder.newLine();
    _builder.append("<login-config>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<auth-method>FORM</auth-method>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<realm-name>citysquire Login</realm-name>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<form-login-config>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<form-login-page>/login.jsf</form-login-page>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<form-error-page>/desktop/error-pages/error.jsf</form-error-page>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</form-login-config>");
    _builder.newLine();
    _builder.append("</login-config>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- User Roles -->");
    _builder.newLine();
    _builder.append("<security-role>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Superuser</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<role-name>SUPERUSER</role-name>");
    _builder.newLine();
    _builder.append("</security-role>");
    _builder.newLine();
    _builder.append("<security-role>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Admin</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<role-name>ADMIN</role-name>");
    _builder.newLine();
    _builder.append("</security-role>");
    _builder.newLine();
    _builder.append("<security-role>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Management</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<role-name>MANAGEMENT</role-name>");
    _builder.newLine();
    _builder.append("</security-role>");
    _builder.newLine();
    _builder.append("<security-role>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Enterprise</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<role-name>ENTERPRISE</role-name>");
    _builder.newLine();
    _builder.append("</security-role>");
    _builder.newLine();
    _builder.append("<security-role>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Provider</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<role-name>PROVIDER</role-name>");
    _builder.newLine();
    _builder.append("</security-role>");
    _builder.newLine();
    _builder.append("<security-role>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Employee</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<role-name>EMPLOYEE</role-name>");
    _builder.newLine();
    _builder.append("</security-role>");
    _builder.newLine();
    _builder.append("<security-role>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>Guest</description>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<role-name>GUEST</role-name>");
    _builder.newLine();
    _builder.append("</security-role>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Mime-Mapping for custom fonts -->");
    _builder.newLine();
    _builder.append("<mime-mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<extension>eot</extension>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<mime-type>application/vnd.ms-fontobject</mime-type>");
    _builder.newLine();
    _builder.append("</mime-mapping>");
    _builder.newLine();
    _builder.append("<mime-mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<extension>ttf</extension>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<mime-type>application/x-font-ttf</mime-type>");
    _builder.newLine();
    _builder.append("</mime-mapping>");
    _builder.newLine();
    _builder.append("<mime-mapping>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<extension>woff</extension>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<mime-type>application/font-woff</mime-type>");
    _builder.newLine();
    _builder.append("</mime-mapping>");
    _builder.newLine();
    return _builder.toString();
  }
}
