/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ifnmg.edu.com.br.grupostrabalho;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
/**
 *
 * @author Cauã Ribeiro da Costa e Aguiar
 */
@Transactional
@WebServlet(name = "Relatorios", urlPatterns = {"/Relatorios"})
public class Relatorios extends HttpServlet {

    @Inject
    private PessoaBeanLocal pessoaBean;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ResultadosServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Estudo Dirigido: Jakarta Persistence Query Language</h1>");
            
           
            
            //<editor-fold defaultstate="collapsed" desc="Questao 1">
            List<Pessoa> pessoasTodasQuery = pessoaBean.findAllPessoaQuery();
            out.println(Util.formatarImprimir("Consulta 1.A:Quais as pessoas (dados completos) cadastradas? Por meio de Query", pessoasTodasQuery));

            List<Pessoa> pessoasTodasTyped = pessoaBean.findAllPessoaTyped();
            out.println(Util.formatarImprimir("Consulta 1.B:Quais as pessoas (dados completos) cadastradas? Por meio de TypedQuery", pessoasTodasTyped));

            List<Pessoa> pessoasTodasNamed = pessoaBean.findAllPessoaNamed();
            out.println(Util.formatarImprimir("Consulta 1.C:Quais as pessoas (dados completos) cadastradas? Por meio de NamedQuery", pessoasTodasNamed));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 2">
            List<String> nomesPessoasQuery = pessoaBean.findNomePessoaQuery();
            out.println(Util.formatarImprimir("Consulta 2.A:Quais os nomes das pessoas? Por meio de Query", nomesPessoasQuery));

            List<String> nomesPessoasTyped = pessoaBean.findNomePessoaTyped();
            out.println(Util.formatarImprimir("Consulta 2.B:Quais os nomes das pessoas? Por meio de TypedQuery", nomesPessoasTyped));

            List<String> nomesPessoasNamed = pessoaBean.findNomePessoaNamed();
            out.println(Util.formatarImprimir("Consulta 2.C:Quais os nomes das pessoas? Por meio de NamedQuery", nomesPessoasNamed));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 3">
            List<Pessoa> pessoasNomeEnderecoQuery = pessoaBean.findNomeEnderecoQuery();
            out.println(Util.formatarImprimir("Consulta 3.A: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de Query", pessoasNomeEnderecoQuery));

            List<Pessoa> pessoasNomeEnderecoTyped = pessoaBean.findNomeEnderecoTyped();
            out.println(Util.formatarImprimir("Consulta 3.B: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de TypedQuery", pessoasNomeEnderecoTyped));

            List<Object[]> pessoasNomeEnderecoNamed = pessoaBean.findNomeEnderecoNamed();
            out.println(Util.formatarImprimir("Consulta 3.C: Quais as pessoas (nome) e seus respectivos endereços (dados completos)? Por meio de NamedQuery", pessoasNomeEnderecoNamed));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 4">
            List<Pessoa> pessoasInAvendaQuery = pessoaBean.findPessoaInAvenidaQuery();
            out.println(Util.formatarImprimir("Consulta 4.A: Quais pessoas (dados completos) moram em avenidas? Por meio de Query", pessoasInAvendaQuery));

            List<Pessoa> pessoasInAvendaTyped = pessoaBean.findPessoaInAvenidaTyped();
            out.println(Util.formatarImprimir("Consulta 4.B: Quais pessoas (dados completos) moram em avenidas? Por meio de TypedQuery", pessoasInAvendaTyped));

            List<Pessoa> pessoasInAvendaNamed = pessoaBean.findPessoaInAvenidaNamed();
            out.println(Util.formatarImprimir("Consulta 4.C: Quais pessoas (dados completos) moram em avenidas? Por meio de NamedQuery", pessoasInAvendaNamed));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 5">
            List<Pessoa> pessoasNotPracaQuery = pessoaBean.findPessoaNotPracaQuery();
            out.println(Util.formatarImprimir("5.A: Quais pessoas (dados completos) não moram em praças? Por meio de Query", pessoasNotPracaQuery));

            List<Pessoa> pessoasNotPracaTyped = pessoaBean.findPessoaNotPracaTyped();
            out.println(Util.formatarImprimir("5.B: Quais pessoas (dados completos) não moram em praças? Por meio de TypedQuery", pessoasNotPracaTyped));

            List<Pessoa> pessoasNotPracaNamed = pessoaBean.findPessoaNotPracaNamed();
            out.println(Util.formatarImprimir("5.A: Quais pessoas (dados completos) não moram em praças? Por meio de NamedQuery", pessoasNotPracaNamed));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 6">
            List<Object[]> pessoaNomeTelefoneQuery = pessoaBean.findPessoaNomeTelefoneQuery();
            out.println(Util.formatarImprimir("Consulta 6.A: Quais os nomes das pessoas e seus respectivos telefones (dados completos)? Por meio de Query", pessoaNomeTelefoneQuery));

            List<Object[]> pessoaNomeTelefoneTyped = pessoaBean.findPessoaNomeTelefoneTyped();
            out.println(Util.formatarImprimir("Consulta 6.B: Quais os nomes das pessoas e seus respectivos telefones (dados completos)? Por meio de TypedQuery", pessoaNomeTelefoneTyped));

            List<Object[]> pessoaNomeTelefoneNamed = pessoaBean.findPessoaNomeTelefoneNamed();
            out.println(Util.formatarImprimir("Consulta 6.C: Quais os nomes das pessoas e seus respectivos telefones (dados completos)? Por meio de NamedQuery", pessoaNomeTelefoneNamed));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 7">
            List<Pessoa> pessoasPorData = pessoaBean.findPessoaByDate(
                    LocalDate.of(2001, Month.APRIL, 1),
                    LocalDate.of(2004, Month.APRIL, 30));

            out.println(Util.formatarImprimir("Consulta 7: Quais as pessoas (dados completos) que nasceram entre abril de 2001 e abril de2004?",pessoasPorData));

            //</editor-fold>
            
                
            //<editor-fold defaultstate="collapsed" desc="Questao 9">
            List<Pessoa> pessoasTelefoneVazio = pessoaBean.findPessoaTelefoneVazio();
            out.println(Util.formatarImprimir("Consulta 9: Quais pessoas (dados completos) não possuem telefone?",pessoasTelefoneVazio));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 10">
            List<String> telefonesPorPessoa = pessoaBean.findQuantidadeTelefonesPorPessoa();
            out.println(Util.formatarImprimir("Consulta 10: Quantos telefones cada pessoa (nome) tem?",telefonesPorPessoa));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 11">
            List<Grupo> gruposInativos = pessoaBean.findGruposInativos();
            out.println(Util.formatarImprimir("Consulta 11: Quais grupos (dados completos) não estão ativos?",gruposInativos));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 12">
            List<String[]> lideresGrupos = pessoaBean.findLideresGrupos();
            out.println(Util.formatarImprimir("Consulta 12: Quais são os líderes (nomes) dos grupos (nomes)?",lideresGrupos));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 13">
            List<String> membrosGrupo = pessoaBean.findMembrosGrupo("Estudo IV");
            out.println(Util.formatarImprimir("Consulta 13: Quais são os membros (nomes) do grupo com nome Estudo IV com ordenação alfabética inversa?",membrosGrupo));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 14">
            List<Grupo> gruposBeatriz = pessoaBean.findGruposPorLider("Beatriz Yana");
            out.println(Util.formatarImprimir("Consulta 14: Quais são os grupos (dados completos) liderados por Beatriz Yana?",gruposBeatriz));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 15">
            List<Object[]> atuacaoGrupos = pessoaBean.findDatasAtuacaoGrupo("Cecília Xerxes");
            out.println(Util.formatarImprimir("Consulta 15: Quais são as datas de início e de término da atuação e os grupos (nomes) nos quais Cecília Xerxes é membro?",atuacaoGrupos));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 16">
            List<Grupo> grupoPorNome = pessoaBean.findGrupoByNome("II");
            out.println(Util.formatarImprimir("Consulta 16: Quais são os grupos (dados completos) que contêm II em seus nomes?",grupoPorNome));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 17">
            List<Object[]> nomeGrupoQuantidadeMembros = pessoaBean.findNomeGrupoQuantidadeMembros();
            out.println(Util.formatarImprimir("Consulta 17: Quais são os grupos (nomes) e os respectivos totais de membros distintos já alocados?",nomeGrupoQuantidadeMembros));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 18">
            List<Object[]> nomeGrupoTotalAtuacoes = pessoaBean.findNomeGrupoPorTotalAtuacoes(3L);
            out.println(Util.formatarImprimir("Consulta 18: Quais grupos (nomes) têm 3 ou mais atuações de membros e quanto são esses totais de atuações?",nomeGrupoTotalAtuacoes));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 19">
            List<String> nomePessoaPorDataEntradaEmGrupo = pessoaBean.findNomePessoaPorDataEntradaEmGrupo(1L, LocalDate.of(2012, Month.JANUARY, 1));
            out.println(Util.formatarImprimir("Consulta 19: Quais membros (nomes) entraram a partir de 2012 no primeiro grupo?",nomePessoaPorDataEntradaEmGrupo));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 20">
            List<MembroDto> membrosDto = pessoaBean.findMembroDto(LocalDate.of(2012, Month.JANUARY, 1));
            out.println(Util.formatarImprimir("Consulta 20: Quais os grupos (nomes), membros (nomes) e as respectivas datas de entrada daqueles que entraram a partir de 2012 em qualquer grupo?",membrosDto));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 21">
            List<String[]> gruposEPessoaSemDataTermino = pessoaBean.findGruposEPessoaSemDataTermino();
            out.println(Util.formatarImprimir("Consulta 21: Quais os grupos (nomes) e respectivos membros (nomes) que não possuem data de término de atuação em seus grupos?",gruposEPessoaSemDataTermino));
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Questao 22">
            List<String[]> liderMembrosGrupos = pessoaBean.findLiderMembrosGrupos();
            out.println(Util.formatarImprimir("Consulta 22: Quais são os grupos (nomes) e líderes (nomes) com respectivos membros (nomes)?",liderMembrosGrupos));
            //</editor-fold>

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}