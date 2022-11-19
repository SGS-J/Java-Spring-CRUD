import React, { FC } from "react";
import { Col, Container, Row } from "react-bootstrap";

const Home: FC<FrontPageProps> = ({ mainbg }) => {
  return (
    <Container
      className="p-5"
      style={{
        minHeight: "100vh",
      }}
    >
      <Row className="justify-content-md-center">
        <Col lg={6}>
          <h4>Hi!, This is an App made with Spring boot and ReactJS</h4>
          <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit,
            officiis dignissimos eos, soluta deserunt distinctio, amet rerum
            veniam nulla harum sunt iusto. Reprehenderit quasi porro non quod
            libero, corporis harum. Lorem ipsum dolor sit amet consectetur
            adipisicing elit. Suscipit, officiis dignissimos eos, soluta
            deserunt distinctio, amet rerum veniam nulla harum sunt iusto.
            Reprehenderit quasi porro non quod libero, corporis harum.
            <br />
            <br />
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit,
            officiis dignissimos eos, soluta deserunt distinctio, amet rerum
            veniam nulla harum sunt iusto. Reprehenderit quasi porro non quod
            libero, corporis harum. Lorem ipsum dolor sit amet consectetur
            adipisicing elit. Suscipit, officiis dignissimos eos, soluta
            deserunt distinctio, amet rerum veniam nulla harum sunt iusto.
            Reprehenderit quasi porro non quod libero, corporis harum.
            <br />
            <br />
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit,
            officiis dignissimos eos, soluta deserunt distinctio, amet rerum
            veniam nulla harum sunt iusto. Reprehenderit quasi porro non quod
            libero, corporis harum. Lorem ipsum dolor sit amet consectetur
            adipisicing elit. Suscipit, officiis dignissimos eos, soluta
            deserunt distinctio, amet rerum veniam nulla harum sunt iusto.
            Reprehenderit quasi porro non quod libero, corporis harum.
          </p>
        </Col>
      </Row>
    </Container>
  );
};

export default Home;
