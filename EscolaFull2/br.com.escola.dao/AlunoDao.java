import java.sql.Connection;
import java.sql.PreparedStatement;

public class AlunoDao extends ConDao {
	public void alterar(Aluno aluno){
		try{
			
		
		Connection conexao = getConnection();
		PreparedStatement pstmt = conexao.prepareStatement("Update tbAluno set nome?, telefone = ?, email=?, datacadastro=?"+ "where matricula=?");
		pstmt.setString (1,aluno.getNome());
		pstmt.setString(2, aluno.getTelefone());
		pstmt.setString(3, aluno.getEmail());
		pstmt.setDate(4, new java.sql.Date( aluno.getDataCadastro().getTime()));
		pstmt.setLong(5, aluno.getMatricula());
		pstmt.execute();
		pstmt.close();
		conexao.close();
		}
		
		catch(Exception e ){
			
			
			
		}
	}
	
	public void Inserir(Aluno aluno) {
		try{
			
			
			Connection conexao = getConnection();
			PreparedStatement pstmt = conexao.prepareStatement("Inserir tbAluno set nome?, telefone = ?, email=?, datacadastro=?"+ "where matricula=?");
			pstmt.setString (1,aluno.getNome());
			pstmt.setString(2, aluno.getTelefone());
			pstmt.setString(3, aluno.getEmail());
			pstmt.setDate(4, new java.sql.Date( aluno.getDataCadastro().getTime()));
			pstmt.setLong(5, aluno.getMatricula());
			pstmt.execute();
			pstmt.close();
			conexao.close();
			}
		catch(Exception e) {
			
			
			
		}
	}
		
	public void Deletar(Aluno aluno) {
try{
			
			
			Connection conexao = getConnection();
			PreparedStatement pstmt = conexao.prepareStatement("Deletar tbAluno set nome?, telefone = ?, email=?, datacadastro=?"+ "where matricula=?");
			pstmt.setString (1,aluno.getNome());
			pstmt.setString(2, aluno.getTelefone());
			pstmt.setString(3, aluno.getEmail());
			pstmt.setDate(4, new java.sql.Date( aluno.getDataCadastro().getTime()));
			pstmt.setLong(5, aluno.getMatricula());
			pstmt.execute();
			pstmt.close();
			conexao.close();
			}
		catch(Exception e) {
			
			
			
		}
		
		
		
	}
	public void Select(Aluno aluno) {
try{
			
			
			Connection conexao = getConnection();
			PreparedStatement pstmt = conexao.prepareStatement("Select from tbAluno where matricula=?");
			pstmt.setString (1,aluno.getNome());
			pstmt.setString(2, aluno.getTelefone());
			pstmt.setString(3, aluno.getEmail());
			pstmt.setDate(4, new java.sql.Date( aluno.getDataCadastro().getTime()));
			pstmt.setLong(5, aluno.getMatricula());
			pstmt.execute();
			pstmt.close();
			conexao.close();
			}
		catch(Exception e) {
			
			
			
		}
		
		
		
		
		
	}
		
		
		
	}
