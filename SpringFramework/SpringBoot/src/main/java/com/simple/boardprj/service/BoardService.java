package com.simple.boardprj.service;

import com.simple.boardprj.dto.BoardDTO;
import com.simple.boardprj.dto.BoardFileDTO;
import com.simple.boardprj.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void save(BoardDTO boardDTO) throws IOException {
        if(boardDTO.getBoardFile().get(0).isEmpty()){
            //파일 없음
            boardDTO.setFileAttached(0);
            boardRepository.save(boardDTO);
        }else{
            //파일이 존재함
            boardDTO.setFileAttached(1);
            //board를 먼저 insert함
            boardRepository.save(boardDTO);

            //파일처리 후 boardfile insert
            for(MultipartFile boardFile : boardDTO.getBoardFile()){
                String originalFilename = boardFile.getOriginalFilename();
                String storedFileName = System.currentTimeMillis()+"_"+originalFilename;

                BoardFileDTO boardFileDTO = new BoardFileDTO();
                boardFileDTO.setOriginalFileName(originalFilename);
                boardFileDTO.setStoredFileName(storedFileName);
                boardFileDTO.setBoardId(boardDTO.getId());

                String savePath = "C:/upload_files/"+storedFileName;
                //실질적으로 파일이 저장되는 코드
                boardFile.transferTo(new File(savePath));
                boardRepository.saveFile(boardFileDTO);
            }
        }

    }

    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }

    public BoardDTO findById(Long id) {
        return boardRepository.findById(id);
    }

    public void updateHits(Long id) {
        boardRepository.updateHits(id);
    }

    public void update(BoardDTO boardDTO) {
        boardRepository.update(boardDTO);
    }

    public void delete(Long id) {
        boardRepository.delete(id);
    }

    public List<BoardFileDTO> findFile(Long id) {
        return boardRepository.findFile(id);
    }

}
