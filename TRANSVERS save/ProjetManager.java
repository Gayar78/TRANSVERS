import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class ProjetManager {
    private static final int MAX_PROJECT_BUTTONS = 3;
    private static final int MAX_TABLE_BUTTONS = 3;

    private static JFrame frame;
    private static JPanel currentMiddlePanel;
    private static boolean isNightMode = false;
    private static Map<String, JPanel> projectMiddlePanels = new HashMap<>();
    private static JPanel baseMiddlePanel;
    private static JPanel navigationBar;
    private static JPanel projectNavigationBar;

    public static void main(String[] args) {
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        frame = new JFrame("TrelloLite");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 700);

        JPanel contentPanel = new JPanel(new BorderLayout());

        navigationBar = createNavigationBar();
        contentPanel.add(navigationBar, BorderLayout.NORTH);

        baseMiddlePanel = createBaseMiddlePanel();
        contentPanel.add(baseMiddlePanel, BorderLayout.CENTER);

        frame.getContentPane().add(contentPanel);
        frame.setVisible(true);
    }

    private static JPanel createNavigationBar() {
        JPanel navigationBar = new JPanel(new GridLayout(1, 3));
        navigationBar.setPreferredSize(new Dimension(frame.getWidth(), 60));

        JLabel titleLabel = new JLabel("TrelloLite");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        navigationBar.add(titleLabel);

        JButton colorButton = new JButton("Gérer les couleurs");
        colorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setNightMode(!isNightMode);
            }
        });
        navigationBar.add(colorButton);

        JButton profileButton = new JButton("Page de profil");
        profileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showProfilePage();
            }
        });
        navigationBar.add(profileButton);

        return navigationBar;
    }

    private static void showProfilePage() {
        JFrame profileFrame = new JFrame("Page de profil");
        profileFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        profileFrame.setSize(350, 150);

        JPanel profilePanel = new JPanel(new FlowLayout());

        JLabel dateTimeLabel = new JLabel("Date et heure actuelles: ");
        profilePanel.add(dateTimeLabel);

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dateTimeLabel.setText("Date et heure actuelles: " + new java.util.Date()+"\n");
            }
        });
        timer.start();

        JLabel nameLabel = new JLabel("Nom de l'utilisateur: Utilisateur78");
        profilePanel.add(nameLabel);

        JLabel emailLabel = new JLabel("Adresse e-mail: utilisateur78.user@gmail.com");
        profilePanel.add(emailLabel);

        profileFrame.getContentPane().add(profilePanel);
        profileFrame.setVisible(true);
    }

    private static void rearrangeProjectButtons() {
        int buttonCount = baseMiddlePanel.getComponentCount() - 1;
        int gridColumns = Math.min(buttonCount, 4);
        int gridRows = (int) Math.ceil((double) buttonCount / gridColumns);

        GridLayout gridLayout = new GridLayout(gridRows, gridColumns);
        baseMiddlePanel.setLayout(gridLayout);

        baseMiddlePanel.revalidate();
        baseMiddlePanel.repaint();
    }

    private static void createProjectButton(String projectName) {
        JButton projectButton = new JButton(projectName);
        projectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (projectMiddlePanels.containsKey(projectName)) {
                    switchToProjectMiddlePanel(projectName);
                } else {
                    createProjectMiddlePanel(projectName);
                }
            }
        });

        baseMiddlePanel.add(projectButton, baseMiddlePanel.getComponentCount() - 1);
        rearrangeProjectButtons();
    }

    private static void createTableButton(String projectName, String tableName) {
        JButton tableButton = new JButton(tableName);
        tableButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform action when table button is clicked
                System.out.println("Tableau '" + tableName + "' clicked!");
            }
        });

        JPanel projectMiddlePanel = projectMiddlePanels.get(projectName);
        projectMiddlePanel.add(tableButton);
        rearrangeTableButtons(projectName);
    }

    private static void rearrangeTableButtons(String projectName) {
        JPanel projectMiddlePanel = projectMiddlePanels.get(projectName);
        int buttonCount = projectMiddlePanel.getComponentCount();
        int gridColumns = Math.min(buttonCount, 4);
        int gridRows = (int) Math.ceil((double) buttonCount / gridColumns);

        GridLayout gridLayout = new GridLayout(gridRows, gridColumns);
        projectMiddlePanel.setLayout(gridLayout);

        projectMiddlePanel.revalidate();
        projectMiddlePanel.repaint();
    }

    private static JPanel createProjectNavigationBar(String projectName) {
        JPanel projectNavigationBar = new JPanel(new GridLayout(1, 2));
        projectNavigationBar.setPreferredSize(new Dimension(frame.getWidth(), 30));

        JLabel titleLabel = new JLabel(projectName);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        projectNavigationBar.add(titleLabel,BorderLayout.WEST);

        JButton homeButton = new JButton("Retour Accueil");
        homeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchToBaseMiddlePanel();
            }
        });
        projectNavigationBar.add(homeButton, BorderLayout.EAST);
        return projectNavigationBar;
    }

    private static void createProjectMiddlePanel(String projectName) {
        JPanel projectMiddlePanel = new JPanel(new BorderLayout());

        JPanel tableButtonPanel = new JPanel(new GridLayout(1, 1));
        JScrollPane scrollPane = new JScrollPane(tableButtonPanel);
        projectMiddlePanel.add(scrollPane, BorderLayout.CENTER);

        JButton plusTableButton = new JButton("Plus Tableau");
        plusTableButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tableButtonPanel.getComponentCount() < MAX_TABLE_BUTTONS) {
                    String tableName = JOptionPane.showInputDialog(frame, "Nom du tableau :");
                    if (tableName != null && !tableName.trim().isEmpty()) {
                        createTableButton(projectName, tableName);
                    }
                }
            }
        });

        tableButtonPanel.add(plusTableButton);
        currentMiddlePanel = projectMiddlePanel;
        projectMiddlePanels.put(projectName, projectMiddlePanel);

        switchToProjectMiddlePanel(projectName);
    }


    private static void switchToProjectMiddlePanel(String projectName) {
        frame.getContentPane().removeAll();

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(navigationBar, BorderLayout.NORTH);

        JPanel projectPanel = new JPanel(new BorderLayout());

        JPanel projectNavigationBar = createProjectNavigationBar(projectName);
        projectPanel.add(projectNavigationBar, BorderLayout.NORTH);

        JPanel projectMiddlePanel = projectMiddlePanels.get(projectName);
        projectPanel.add(projectMiddlePanel, BorderLayout.CENTER);

        contentPanel.add(projectPanel, BorderLayout.CENTER);

        frame.getContentPane().add(contentPanel);
        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();
    }

    private static void switchToBaseMiddlePanel() {
        frame.getContentPane().removeAll();

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.add(navigationBar, BorderLayout.NORTH);
        contentPanel.add(baseMiddlePanel, BorderLayout.CENTER);

        frame.getContentPane().add(contentPanel);
        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();
    }

    private static JPanel createBaseMiddlePanel() {
        JPanel baseMiddlePanel = new JPanel(new GridLayout(1, 4));

        JButton plusProjectButton = new JButton("Plus Projet");
        plusProjectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (baseMiddlePanel.getComponentCount() - 1 < MAX_PROJECT_BUTTONS) {
                    String projectName = JOptionPane.showInputDialog(frame, "Nom du projet :");
                    if (projectName != null && !projectName.trim().isEmpty()) {
                        createProjectButton(projectName);
                    }
                }
            }
        });

        baseMiddlePanel.add(plusProjectButton);

        return baseMiddlePanel;
    }

    private static void setNightMode(boolean isNightMode) {
        ProjetManager.isNightMode = isNightMode;

        if (isNightMode) {
            frame.getContentPane().setBackground(Color.DARK_GRAY);
            baseMiddlePanel.setBackground(Color.DARK_GRAY);
            navigationBar.setBackground(Color.DARK_GRAY);
            projectNavigationBar.setBackground(Color.DARK_GRAY);
        } else {
            frame.getContentPane().setBackground(Color.WHITE);
            baseMiddlePanel.setBackground(Color.WHITE);
            navigationBar.setBackground(Color.WHITE);
            projectNavigationBar.setBackground(Color.WHITE);
        }

        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();
    }
}
