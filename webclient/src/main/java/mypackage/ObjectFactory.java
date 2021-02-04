
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConfirmePaye_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "confirmePaye");
    private final static QName _GetListTransaction_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getListTransaction");
    private final static QName _UpdateClientResponse_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "updateClientResponse");
    private final static QName _DeleteClient_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "deleteClient");
    private final static QName _UpdateClient_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "updateClient");
    private final static QName _GetListClient_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getListClient");
    private final static QName _DeleteClientResponse_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "deleteClientResponse");
    private final static QName _GetSoldeResponse_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getSoldeResponse");
    private final static QName _Role_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "role");
    private final static QName _GetListCreancier_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getListCreancier");
    private final static QName _GetListCreancierResponse_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getListCreancierResponse");
    private final static QName _GetImpayesResponse_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getImpayesResponse");
    private final static QName _SetClientPassword_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "setClientPassword");
    private final static QName _GetImpayes_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getImpayes");
    private final static QName _SetClientPasswordResponse_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "setClientPasswordResponse");
    private final static QName _SaveClient_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "saveClient");
    private final static QName _GetListTransactionResponse_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getListTransactionResponse");
    private final static QName _GetIsActivatedResponse_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getIsActivatedResponse");
    private final static QName _SaveClientResponse_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "saveClientResponse");
    private final static QName _GetListClientResponse_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getListClientResponse");
    private final static QName _ConfirmePayeResponse_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "confirmePayeResponse");
    private final static QName _GetIsActivated_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getIsActivated");
    private final static QName _GetSolde_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "getSolde");
    private final static QName _Client_QNAME = new QName("http://controllers.cmi.api.ensas.com/", "client");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListClient }
     * 
     */
    public GetListClient createGetListClient() {
        return new GetListClient();
    }

    /**
     * Create an instance of {@link DeleteClientResponse }
     * 
     */
    public DeleteClientResponse createDeleteClientResponse() {
        return new DeleteClientResponse();
    }

    /**
     * Create an instance of {@link GetSoldeResponse }
     * 
     */
    public GetSoldeResponse createGetSoldeResponse() {
        return new GetSoldeResponse();
    }

    /**
     * Create an instance of {@link AppRole }
     * 
     */
    public AppRole createAppRole() {
        return new AppRole();
    }

    /**
     * Create an instance of {@link ConfirmePaye }
     * 
     */
    public ConfirmePaye createConfirmePaye() {
        return new ConfirmePaye();
    }

    /**
     * Create an instance of {@link GetListTransaction }
     * 
     */
    public GetListTransaction createGetListTransaction() {
        return new GetListTransaction();
    }

    /**
     * Create an instance of {@link UpdateClientResponse }
     * 
     */
    public UpdateClientResponse createUpdateClientResponse() {
        return new UpdateClientResponse();
    }

    /**
     * Create an instance of {@link DeleteClient }
     * 
     */
    public DeleteClient createDeleteClient() {
        return new DeleteClient();
    }

    /**
     * Create an instance of {@link UpdateClient }
     * 
     */
    public UpdateClient createUpdateClient() {
        return new UpdateClient();
    }

    /**
     * Create an instance of {@link SaveClient }
     * 
     */
    public SaveClient createSaveClient() {
        return new SaveClient();
    }

    /**
     * Create an instance of {@link GetListCreancier }
     * 
     */
    public GetListCreancier createGetListCreancier() {
        return new GetListCreancier();
    }

    /**
     * Create an instance of {@link GetListCreancierResponse }
     * 
     */
    public GetListCreancierResponse createGetListCreancierResponse() {
        return new GetListCreancierResponse();
    }

    /**
     * Create an instance of {@link GetImpayesResponse }
     * 
     */
    public GetImpayesResponse createGetImpayesResponse() {
        return new GetImpayesResponse();
    }

    /**
     * Create an instance of {@link SetClientPassword }
     * 
     */
    public SetClientPassword createSetClientPassword() {
        return new SetClientPassword();
    }

    /**
     * Create an instance of {@link GetImpayes }
     * 
     */
    public GetImpayes createGetImpayes() {
        return new GetImpayes();
    }

    /**
     * Create an instance of {@link SetClientPasswordResponse }
     * 
     */
    public SetClientPasswordResponse createSetClientPasswordResponse() {
        return new SetClientPasswordResponse();
    }

    /**
     * Create an instance of {@link GetListClientResponse }
     * 
     */
    public GetListClientResponse createGetListClientResponse() {
        return new GetListClientResponse();
    }

    /**
     * Create an instance of {@link ConfirmePayeResponse }
     * 
     */
    public ConfirmePayeResponse createConfirmePayeResponse() {
        return new ConfirmePayeResponse();
    }

    /**
     * Create an instance of {@link GetIsActivated }
     * 
     */
    public GetIsActivated createGetIsActivated() {
        return new GetIsActivated();
    }

    /**
     * Create an instance of {@link GetListTransactionResponse }
     * 
     */
    public GetListTransactionResponse createGetListTransactionResponse() {
        return new GetListTransactionResponse();
    }

    /**
     * Create an instance of {@link GetIsActivatedResponse }
     * 
     */
    public GetIsActivatedResponse createGetIsActivatedResponse() {
        return new GetIsActivatedResponse();
    }

    /**
     * Create an instance of {@link SaveClientResponse }
     * 
     */
    public SaveClientResponse createSaveClientResponse() {
        return new SaveClientResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link GetSolde }
     * 
     */
    public GetSolde createGetSolde() {
        return new GetSolde();
    }

    /**
     * Create an instance of {@link Impaye }
     * 
     */
    public Impaye createImpaye() {
        return new Impaye();
    }

    /**
     * Create an instance of {@link Creancier }
     * 
     */
    public Creancier createCreancier() {
        return new Creancier();
    }

    /**
     * Create an instance of {@link Creance }
     * 
     */
    public Creance createCreance() {
        return new Creance();
    }

    /**
     * Create an instance of {@link ResultImpaye }
     * 
     */
    public ResultImpaye createResultImpaye() {
        return new ResultImpaye();
    }

    /**
     * Create an instance of {@link Transaction }
     * 
     */
    public Transaction createTransaction() {
        return new Transaction();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmePaye }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "confirmePaye")
    public JAXBElement<ConfirmePaye> createConfirmePaye(ConfirmePaye value) {
        return new JAXBElement<ConfirmePaye>(_ConfirmePaye_QNAME, ConfirmePaye.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getListTransaction")
    public JAXBElement<GetListTransaction> createGetListTransaction(GetListTransaction value) {
        return new JAXBElement<GetListTransaction>(_GetListTransaction_QNAME, GetListTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "updateClientResponse")
    public JAXBElement<UpdateClientResponse> createUpdateClientResponse(UpdateClientResponse value) {
        return new JAXBElement<UpdateClientResponse>(_UpdateClientResponse_QNAME, UpdateClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "deleteClient")
    public JAXBElement<DeleteClient> createDeleteClient(DeleteClient value) {
        return new JAXBElement<DeleteClient>(_DeleteClient_QNAME, DeleteClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "updateClient")
    public JAXBElement<UpdateClient> createUpdateClient(UpdateClient value) {
        return new JAXBElement<UpdateClient>(_UpdateClient_QNAME, UpdateClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getListClient")
    public JAXBElement<GetListClient> createGetListClient(GetListClient value) {
        return new JAXBElement<GetListClient>(_GetListClient_QNAME, GetListClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "deleteClientResponse")
    public JAXBElement<DeleteClientResponse> createDeleteClientResponse(DeleteClientResponse value) {
        return new JAXBElement<DeleteClientResponse>(_DeleteClientResponse_QNAME, DeleteClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoldeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getSoldeResponse")
    public JAXBElement<GetSoldeResponse> createGetSoldeResponse(GetSoldeResponse value) {
        return new JAXBElement<GetSoldeResponse>(_GetSoldeResponse_QNAME, GetSoldeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "role")
    public JAXBElement<AppRole> createRole(AppRole value) {
        return new JAXBElement<AppRole>(_Role_QNAME, AppRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCreancier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getListCreancier")
    public JAXBElement<GetListCreancier> createGetListCreancier(GetListCreancier value) {
        return new JAXBElement<GetListCreancier>(_GetListCreancier_QNAME, GetListCreancier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListCreancierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getListCreancierResponse")
    public JAXBElement<GetListCreancierResponse> createGetListCreancierResponse(GetListCreancierResponse value) {
        return new JAXBElement<GetListCreancierResponse>(_GetListCreancierResponse_QNAME, GetListCreancierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImpayesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getImpayesResponse")
    public JAXBElement<GetImpayesResponse> createGetImpayesResponse(GetImpayesResponse value) {
        return new JAXBElement<GetImpayesResponse>(_GetImpayesResponse_QNAME, GetImpayesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClientPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "setClientPassword")
    public JAXBElement<SetClientPassword> createSetClientPassword(SetClientPassword value) {
        return new JAXBElement<SetClientPassword>(_SetClientPassword_QNAME, SetClientPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImpayes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getImpayes")
    public JAXBElement<GetImpayes> createGetImpayes(GetImpayes value) {
        return new JAXBElement<GetImpayes>(_GetImpayes_QNAME, GetImpayes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetClientPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "setClientPasswordResponse")
    public JAXBElement<SetClientPasswordResponse> createSetClientPasswordResponse(SetClientPasswordResponse value) {
        return new JAXBElement<SetClientPasswordResponse>(_SetClientPasswordResponse_QNAME, SetClientPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveClient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "saveClient")
    public JAXBElement<SaveClient> createSaveClient(SaveClient value) {
        return new JAXBElement<SaveClient>(_SaveClient_QNAME, SaveClient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getListTransactionResponse")
    public JAXBElement<GetListTransactionResponse> createGetListTransactionResponse(GetListTransactionResponse value) {
        return new JAXBElement<GetListTransactionResponse>(_GetListTransactionResponse_QNAME, GetListTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIsActivatedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getIsActivatedResponse")
    public JAXBElement<GetIsActivatedResponse> createGetIsActivatedResponse(GetIsActivatedResponse value) {
        return new JAXBElement<GetIsActivatedResponse>(_GetIsActivatedResponse_QNAME, GetIsActivatedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "saveClientResponse")
    public JAXBElement<SaveClientResponse> createSaveClientResponse(SaveClientResponse value) {
        return new JAXBElement<SaveClientResponse>(_SaveClientResponse_QNAME, SaveClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListClientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getListClientResponse")
    public JAXBElement<GetListClientResponse> createGetListClientResponse(GetListClientResponse value) {
        return new JAXBElement<GetListClientResponse>(_GetListClientResponse_QNAME, GetListClientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmePayeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "confirmePayeResponse")
    public JAXBElement<ConfirmePayeResponse> createConfirmePayeResponse(ConfirmePayeResponse value) {
        return new JAXBElement<ConfirmePayeResponse>(_ConfirmePayeResponse_QNAME, ConfirmePayeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIsActivated }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getIsActivated")
    public JAXBElement<GetIsActivated> createGetIsActivated(GetIsActivated value) {
        return new JAXBElement<GetIsActivated>(_GetIsActivated_QNAME, GetIsActivated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSolde }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "getSolde")
    public JAXBElement<GetSolde> createGetSolde(GetSolde value) {
        return new JAXBElement<GetSolde>(_GetSolde_QNAME, GetSolde.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controllers.cmi.api.ensas.com/", name = "client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<Client>(_Client_QNAME, Client.class, null, value);
    }

}
