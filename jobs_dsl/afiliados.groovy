import hudson.plugins.git.*;

def scm = new GitSCM("https://github.com/RubenSemiao/jenkins-jobs.git")
scm.branches = [new BranchSpec("*/jobs")];

def flowDefinition = new org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition(scm, "afiliados/Jenkinsfile")

def parent = Jenkins.instance
def job = new org.jenkinsci.plugins.workflow.job.WorkflowJob(parent, "Afiliados")
job.definition = flowDefinition

parent.reload()